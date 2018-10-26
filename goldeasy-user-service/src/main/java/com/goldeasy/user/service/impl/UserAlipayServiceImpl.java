package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.common.util.DateTimeUtil;
import com.goldeasy.user.dto.UserBankCardDTO;
import com.goldeasy.user.entity.UserAlipay;
import com.goldeasy.user.mapper.SysBankMapper;
import com.goldeasy.user.mapper.UserAlipayMapper;
import com.goldeasy.user.mapper.UserBankCardMapper;
import com.goldeasy.user.service.UserAlipayService;
import com.goldeasy.user.service.UserBankCardService;
import com.goldeasy.user.vo.SysBankVO;
import com.goldeasy.user.vo.UserAlipayVO;
import com.goldeasy.user.vo.UserBankVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserAlipayService.class, version = "${dubbo.service.version}")
public class UserAlipayServiceImpl implements UserAlipayService {
    private final Logger logger = LoggerFactory.getLogger(UserAlipayServiceImpl.class);

    @Autowired
    private UserAlipayMapper userAlipayMapper;

    /**
     * fetch 获取用户支付宝信息
     * @author: tianliya
     * @time: 2018/10/26
     * @param userId
     * @return
     */
    @Override
    public UserAlipayVO getUserAlipay(Long userId) {
        this.logger.info("获取用户支付宝信息业务实现");
        try{
            UserAlipayVO userAlipayVO = this.userAlipayMapper.getUserAliPayNum(userId);
            return userAlipayVO;
        }catch (Exception e){
            this.logger.error("获取用户支付宝信息业务实现异常,用户id:{},---------->时间:{}",userId,LocalDateTime.now());
            throw new UserModuleException("获取用户支付宝信息业务实现异常",e.getCause());
        }

    }

    /**
     * fetch 用户绑定支付宝
     * @author: tianliya
     * @time: 2018/10/26
     * @param userAlipay
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean bindUserAlipay(UserAlipay userAlipay, Long userId) {
        this.logger.info("绑定支付宝信息业务实现");
        userAlipay.setUserId(userId);
        userAlipay.setGmtCreate(DateTimeUtil.toDate(LocalDateTime.now()));
        try{
            int  flag = this.userAlipayMapper.bindAliPay(userAlipay);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            this.logger.error("绑定支付宝信息业务实现异常,支付宝信息:{},---------->时间:{}",userAlipay.toString(),LocalDateTime.now());
            throw new UserModuleException("绑定支付宝信息业务实现异常",e.getCause());
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean modifyUserAlipay(UserAlipay userAlipay) {
        this.logger.info("修改支付宝信息业务实现");
        userAlipay.setGmtModified(DateTimeUtil.toDate(LocalDateTime.now()));
        try{
            int  flag = this.userAlipayMapper.updateAliPay(userAlipay);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            this.logger.error("修改支付宝信息业务实现异常,支付宝信息:{},---------->时间:{}",userAlipay.toString(),LocalDateTime.now());
            throw new UserModuleException("绑定支付宝信息业务实现异常",e.getCause());
        }
    }
}
