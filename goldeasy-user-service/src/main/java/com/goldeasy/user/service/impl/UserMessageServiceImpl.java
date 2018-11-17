package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.user.entity.UserAddress;
import com.goldeasy.user.mapper.UserAddressMapper;
import com.goldeasy.user.mapper.UserMessageMapper;
import com.goldeasy.user.service.UserAddressService;
import com.goldeasy.user.service.UserMessageService;
import com.goldeasy.user.service.UserService;
import com.goldeasy.user.vo.UserAddressVO;
import com.goldeasy.user.vo.UserMessageInfoVO;
import com.goldeasy.user.vo.UserMessageVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserService.class, version = "${dubbo.service.version}")
public class UserMessageServiceImpl implements UserMessageService {
    private final Logger logger = LoggerFactory.getLogger(UserMessageServiceImpl.class);
    @Resource
    private UserMessageMapper userMessageMapper;


    @Override
    public List<UserMessageVO> listUserMessage(Long userId, Integer pageNum, Integer pageSize) {
        this.logger.info("获取用户的所有消息-业务层");
        int start = pageSize*(pageNum - 1);

        try{
            List<UserMessageVO> userMessageList = this.userMessageMapper.listUserMessage(userId,start,pageSize);
            return userMessageList;
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("获取用户的所有消息异常-业务层");
            throw new UserModuleException("获取用户的所有消息异常",e.getCause());
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean readAll(Long userId) {
        this.logger.info("将所有未读消息设置已读-业务层");
        try{
            int flag = this.userMessageMapper.updateMessageToRead(userId);
            if (flag > 0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("将所有未读消息设置已读异常-业务层");
            throw new UserModuleException("将所有未读消息设置已读异常",e.getCause());
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserMessageInfoVO getUserMessageInfo(Long id) {
        this.logger.info("获取用户消息详情-业务层");
        try{
            //获取消息详情
            UserMessageInfoVO userMessageInfo = this.userMessageMapper.selectUserMessageById(id);
            if (userMessageInfo != null){
                this.userMessageMapper.updateMessageToReadById(id);
            }
            return userMessageInfo;
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("获取用户消息详情异常-业务层");
            throw new UserModuleException("获取用户消息详情异常",e.getCause());
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteUserMessage(Long id) {
        this.logger.info("删除用户的消息-业务层");
        try{
            int flag = this.userMessageMapper.deleteByPrimaryKey(id);
            if (flag > 0){
                return true;
            }else {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("删除用户消息异常-业务层");
            throw new UserModuleException("删除用户的消息异常",e.getCause());
        }
    }
}
