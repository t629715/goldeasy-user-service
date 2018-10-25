package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.UserInfo;
import com.goldeasy.user.vo.UserNickNameVO;
import org.apache.ibatis.annotations.Param;
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

    /**
     * fetch 获取用户的头像地址
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @return
     */
    String getUserHeadImage(Long userId);

    /**
     * fetch 用户修改昵称接口
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @param userNickName
     * @return
     */
    int updateUserNickName(@Param("userId") Long userId, @Param("userNickName") String userNickName);

    /**
     * fetch 用户获取昵称
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @return
     */
    UserNickNameVO getUserNickName(Long userId);

    /**
     * fetch 修改用户头像
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId 用户id
     * @param userHeadImage 用户头像
     * @return
     */
    int updateUserHeadImage(@Param("userId") Long userId, @Param("userHeadImage") String userHeadImage);
}