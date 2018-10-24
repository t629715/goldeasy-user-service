package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author: tianliya
 * @time: 2018/10/22
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    /**
     * fetch 获取用户的昵称、用户名、头像
     * @author: tianliya
     * @time: 2018/10/23
     * @param id
     * @return
     */
    UserInfo getUserInfoById(Long id);
}