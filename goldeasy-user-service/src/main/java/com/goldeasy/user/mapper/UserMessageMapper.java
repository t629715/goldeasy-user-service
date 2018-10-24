package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserMessage;
import org.springframework.stereotype.Repository;

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
}