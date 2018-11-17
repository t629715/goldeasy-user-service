package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserMessage;
import com.goldeasy.user.vo.UserMessageInfoVO;
import com.goldeasy.user.vo.UserMessageVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMessageMapper extends BaseMapper<UserMessage> {
    /**
     * fetch
     * @author: tianliya
     * @time: 2018/10/23
     * @param id
     * @return
     */
    int getUnReadAmountById(Long id);

    /**
     * fetch 获取用户的所哟消息
     * @time: 2018/11/13
     * @param userId
     * @param start
     * @param size
     * @return
     */
    List<UserMessageVO> listUserMessage(Long userId, Integer start, Integer size);

    /**
     * fetch 获取消息详情
     * @time: 2018/11/13
     * @param id
     * @return
     */
    UserMessageInfoVO selectUserMessageById(Long id);

    /**
     * fetch 将用户未读消息设为已读
     * @time: 2018/11/13
     * @param userId
     * @return
     */
    int updateMessageToRead(Long userId);

    /**
     * fetch 将选中的消息设置为已读
     * @time: 2018/11/13
     * @param id
     * @return
     */
    int updateMessageToReadById(Long id);
}