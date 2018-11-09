package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.common.redis.RedisService;
import com.goldeasy.common.util.DateTimeUtil;
import com.goldeasy.common.util.MD5Util;
import com.goldeasy.user.dto.OrderAmountDTO;
import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserRealNameDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.entity.*;
import com.goldeasy.user.mapper.*;
import com.goldeasy.user.service.UserAddressService;
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
import java.util.Calendar;
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
public class UserAddressServiceImpl implements UserAddressService {
    private final Logger logger = LoggerFactory.getLogger(UserAddressServiceImpl.class);
    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addUserAddress(UserAddress userAddress, Long userId) {
        Calendar now = Calendar.getInstance();
        userAddress.setGmtCreate(now.getTime());
        userAddress.setUserId(userId);
        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(userAddress.getAddressProvince()).append(userAddress.getAddressCity()).append(userAddress.getAddressCounty()).append(userAddress.getAddressInfo());
        userAddress.setReceiveAddress(addressBuilder.toString());
        try{
            //查询用户是否已经有收货地址
            List<UserAddress> addressList = this.userAddressMapper.select(userAddress);
            //若无收货地址此处添加的收货地址为默认收货地址
            if (addressList == null || addressList.size() == 0 ){
                userAddress.setIsDefault(new Short("1"));
            }
        }catch (Exception e){
            e.printStackTrace();
            this.logger.warn("添加收货地址-获取用户已添加的收货地址的数量异常，用户id：{}，要添加的信息{}",userId,userAddress);
            throw new UserModuleException("添加收货地址");
        }

        try{
            int flag = this.userAddressMapper.insertSelective(userAddress);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            this.logger.warn("添加收货地址-添加收货地址的数量异常");
            throw new UserModuleException("添加收货地址");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteUserAddressById(Long id) {
        this.logger.debug("删除收货地址-业务层");
        try{
            int flag = this.userAddressMapper.deleteByPrimaryKey(id);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (UserModuleException e){
            this.logger.warn("删除用户收货地址-业务层异常,地址id：{}",id);
            e.printStackTrace();
            throw new UserModuleException("删除用户收货地址-业务层异常");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean modifyUserAddressById(UserAddress userAddress) {
        this.logger.debug("修改收货地址-业务层");
        try{
            int flag = this.userAddressMapper.updateByPrimaryKeySelective(userAddress);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (UserModuleException e){
            this.logger.warn("修改收货地址-业务层异常,地址信息：{}",userAddress.toString());
            e.printStackTrace();
            throw new UserModuleException("修改收货地址-业务层异常");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean setDefaultAddress(Long id, Long userId) {
        this.logger.debug("设置默认收货地址-业务层");
        try{
            //获取原有默认地址信息
            UserAddress defaultAddress = this.userAddressMapper.selectDefaultAddress(userId);
            if (defaultAddress != null){
                defaultAddress.setIsDefault(new Short("0"));
                this.userAddressMapper.updateByPrimaryKeySelective(defaultAddress);
            }
            defaultAddress = new UserAddress();
            defaultAddress.setIsDefault(new Short("1"));
            defaultAddress.setId(id);
            int flag = this.userAddressMapper.updateByPrimaryKeySelective(defaultAddress);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (UserModuleException e){
            this.logger.warn("设置默认收货地址-业务层异常,地址id：{}",id);
            e.printStackTrace();
            throw new UserModuleException("设置默认收货地址-业务层异常");
        }
    }

    @Override
    public List<UserAddressVO> listUserAddress(Long userId) {
        this.logger.debug("获取收货地址-业务层");
        try{
            List<UserAddressVO> userAddressList = this.userAddressMapper.listUserAddress(userId);
            return userAddressList;
        }catch (UserModuleException e){
            this.logger.warn("获取收货地址-业务层异常,用户id：{}",userId);
            e.printStackTrace();
            throw new UserModuleException("获取收货地址-业务层异常");
        }
    }
}
