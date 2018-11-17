package com.goldeasy.user.service;



import com.goldeasy.user.vo.UserMessageInfoVO;
import com.goldeasy.user.vo.UserMessageVO;

import java.util.List;

/**
 * @author:
 * @CreateTime:2018-10-15 17:11
 * @Description:用户消息相关业务接口
 **/
public interface UserMessageService {
    /**
     * fetch 获取用户的消息列表
     * @author:
     * @time: 2018/11/13
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<UserMessageVO> listUserMessage(Long userId, Integer pageNum, Integer pageSize);

    /**
     * fetch 将用户的所有未读消息设为已读
     * @author:
     * @time: 2018/11/13
     * @param userId
     * @return
     */
    Boolean readAll(Long userId);

    /**
     * fetch 获取用户消息详情
     * @author:
     * @time: 2018/11/13
     * @param id
     * @return
     */
    UserMessageInfoVO getUserMessageInfo(Long id);

    /**
     * fetch 删除用户消息
     * @author:
     * @time: 2018/11/13
     * @param id
     * @return
     */
    Boolean deleteUserMessage(Long id);




}
