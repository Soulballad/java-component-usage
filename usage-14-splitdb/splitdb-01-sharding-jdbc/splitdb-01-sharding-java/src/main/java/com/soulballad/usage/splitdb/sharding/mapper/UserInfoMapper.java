package com.soulballad.usage.splitdb.sharding.mapper;

import com.soulballad.usage.splitdb.sharding.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    List<UserInfo> selectByRange(@Param("firstId") Long firstId, @Param("lastId") Long lastId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
