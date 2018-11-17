package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.user.entity.UserInvoiceInfo;
import com.goldeasy.user.mapper.UserInvoiceInfoMapper;
import com.goldeasy.user.mapper.UserMessageMapper;
import com.goldeasy.user.service.UserInvoiceInfoService;
import com.goldeasy.user.service.UserMessageService;
import com.goldeasy.user.service.UserService;
import com.goldeasy.user.vo.UserInvoiceInfoVO;
import com.goldeasy.user.vo.UserMessageInfoVO;
import com.goldeasy.user.vo.UserMessageVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserService.class, version = "${dubbo.service.version}")
public class UserInvoiceInfoServiceImpl implements UserInvoiceInfoService {
    private final Logger logger = LoggerFactory.getLogger(UserInvoiceInfoServiceImpl.class);
    @Resource
    private UserInvoiceInfoMapper userInvoiceInfoMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addUserInvoice(UserInvoiceInfo userInvoiceInfo, Long userId) {
        this.logger.info("添加用户发票信息-业务层");
        try{
            userInvoiceInfo.setGmtCreate(new Date());
            userInvoiceInfo.setUserId(userId);
            int flag = this.userInvoiceInfoMapper.insertSelective(userInvoiceInfo);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            this.logger.error("添加用户发票信息异常-业务层，添加信息：{}",userInvoiceInfo.toString());
            e.printStackTrace();
            throw new UserModuleException("添加用户发票信息异常",e.getCause());
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean modifyUserInvoice(UserInvoiceInfo userInvoiceInfo) {
        this.logger.info("修改用户发票信息-业务层");
        try{
            userInvoiceInfo.setGmtModified(new Date());
            int flag  =this.userInvoiceInfoMapper.updateByPrimaryKeySelective(userInvoiceInfo);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            this.logger.error("修改用户发票信息异常-业务层，添加信息：{}",userInvoiceInfo.toString());
            e.printStackTrace();
            throw new UserModuleException("修改用户发票信息异常",e.getCause());
        }
    }

    @Override
    public UserInvoiceInfoVO selectUserInvoiceInfo(Long userId) {
        this.logger.info("获取用户发票信息-业务层");
        try{
            List<UserInvoiceInfoVO> userInvoiceInfos = this.userInvoiceInfoMapper.listUserInvoiceInfo(userId);
            if (userInvoiceInfos != null && userInvoiceInfos.size() != 0){
                return userInvoiceInfos.get(0);
            }
            return null;
        }catch (Exception e){
            this.logger.error("获取用户发票信息异常-业务层}");
            e.printStackTrace();
            throw new UserModuleException("获取用户发票信息异常",e.getCause());
        }
    }

    @Override
    public List<UserInvoiceInfoVO> listUserInvoiceInfo(Long userId) {
        this.logger.info("获取用户所有发票信息-业务层");
        try{

        }catch (Exception e){
            this.logger.error("获取用户所有发票信息异常-业务层，添加信息：{}");
            e.printStackTrace();
            throw new UserModuleException("获取用户所有发票信息异常",e.getCause());
        }
        return null;
    }
}
