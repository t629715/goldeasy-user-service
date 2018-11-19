package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserMarkAccountRecord;
import com.goldeasy.user.vo.UserMarkRecordVO;

import java.util.List;

public interface UserMarkAccountRecordMapper extends BaseMapper<UserMarkAccountRecord> {
    /**
     * fetch 获取用户积分记录
     * @time: 2018/11/19
     * @param userId
     * @return
     */
    List<UserMarkRecordVO> listUserMarkRecord(Long userId);
}