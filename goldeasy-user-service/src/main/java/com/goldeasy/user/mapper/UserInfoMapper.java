package com.goldeasy.user.mapper;


import com.goldeasy.user.entity.UserInfo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    UserInfoMapper INSTANCE = Mappers.getMapper(UserInfoMapper.class);

}