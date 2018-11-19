package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.common.redis.RedisService;
import com.goldeasy.common.util.DateTimeUtil;
import com.goldeasy.common.util.MD5Util;
import com.goldeasy.user.dto.*;
import com.goldeasy.user.entity.*;
import com.goldeasy.user.mapper.*;
import com.goldeasy.user.service.UserMarkAccountInfoService;
import com.goldeasy.user.service.UserService;
import com.goldeasy.user.util.JwtUtil;
import com.goldeasy.user.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserService.class, version = "${dubbo.service.version}")
public class UserMarkAccountInfoServiceImpl implements UserMarkAccountInfoService {
    private final Logger logger = LoggerFactory.getLogger(UserMarkAccountInfoServiceImpl.class);
    @Resource
    private UserMarkAccountInfoMapper userMarkAccountInfoMapper;
    @Resource
    private UserMarkAccountRecordMapper userMarkAccountRecordMapper;
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserMarkVO getUserMarkInfo(Long userId) {
        this.logger.debug("获取用户的积分余额与余户积分任务记录-业务层");
        BigDecimal markAmount = new BigDecimal(0);
        try {
            markAmount = this.userMarkAccountInfoMapper.getMarkAmountById(userId);
        } catch (Exception e) {
            e.printStackTrace();
            this.logger.debug("获取用户的积分余额异常-业务层");
            throw new UserModuleException("获取用户的积分余额异常");
        }
        List<MarkTaskVO> markTaskList = new ArrayList<>();
        try {

        } catch (Exception e) {
            e.printStackTrace();
            this.logger.debug("获取用户的积分任内务记录异常-业务层");
            throw new UserModuleException("获取用户的积分任内务记录异常");
        }
        UserMarkVO userMarkVO = new UserMarkVO();
        userMarkVO.setMarkAmount(markAmount);
        userMarkVO.setMarkTaskList(markTaskList);
        return userMarkVO;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean modifyUserMarkInfo(UserMarkDTO userMarkDTO) {
        this.logger.debug("修改用户的积分余额-业务层");
        UserMarkAccountInfo userMarkForUpdate = this.userMarkAccountInfoMapper.lockForUpdate(userMarkDTO.getUserId());
        int flag = 0;
        try {
            flag = this.userMarkAccountInfoMapper.updateByPrimaryKeySelective(userMarkForUpdate);
            if (flag < 0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.logger.error("修改用户的积分余额异常-业务层");
            throw new UserModuleException("修改用户的积分余额异常");
        }
        UserInfo userInfo = this.userInfoMapper.getUserInfoById(userMarkDTO.getUserId());
        UserMarkAccountRecord userMarkAccountRecord = new UserMarkAccountRecord();
        BigDecimal tempMark = userMarkForUpdate.getMarkAmount().add(userMarkDTO.getMark());
        userMarkAccountRecord.setAfterMark(tempMark);
        userMarkAccountRecord.setMark(userMarkDTO.getMark());
        userMarkAccountRecord.setPreMark(userMarkForUpdate.getMarkAmount());
        //变更原因
        userMarkAccountRecord.setAlterReason(userMarkDTO.getAlertReason());
        userMarkAccountRecord.setSide(new Short("1"));
        userMarkAccountRecord.setUserId(userMarkDTO.getUserId());
        userMarkAccountRecord.setUserName(userInfo.getUserName());
        userMarkAccountRecord.setGmtCreate(new Date());

        userMarkAccountRecord.setGeneralManagerId(userInfo.getGeneralManagerId());
        userMarkAccountRecord.setManagerId(userInfo.getManagerId());
        userMarkAccountRecord.setMarketingDirectorId(userInfo.getMarketingDirectorId());
        userMarkAccountRecord.setDirectorId(userInfo.getDirectorId());
        userMarkAccountRecord.setBrokerId(userInfo.getBrokerId());
        try {
            this.logger.debug("修改用户的积分余额-插入变更记录-业务层");
            flag = this.userMarkAccountRecordMapper.insertSelective(userMarkAccountRecord);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            this.logger.error("修改用户的积分余额-插入变更记录异常-业务层,原因：{}",e.getMessage());
            e.printStackTrace();
            throw new UserModuleException("修改用户的积分余额-插入变更记录异常");
        }
    }

    @Override
    public List<UserMarkRecordVO> listUserMarkRecord(Long userId) {
        this.logger.debug("获取用户的积分记录-业务层");
        try{
            List<UserMarkRecordVO> userMarkRecordList = this.userMarkAccountRecordMapper.listUserMarkRecord(userId);
            return userMarkRecordList;
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("获取用户的积分记录异常-业务层,原因：{},用户id：{}",e.getMessage(),userId);
            throw new UserModuleException("获取用户的积分记录异常");

        }

    }
}
