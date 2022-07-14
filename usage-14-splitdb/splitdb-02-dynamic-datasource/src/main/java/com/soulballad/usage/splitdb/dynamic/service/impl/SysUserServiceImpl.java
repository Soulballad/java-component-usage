package com.soulballad.usage.splitdb.dynamic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soulballad.usage.splitdb.dynamic.datasource.DataSourceNames;
import com.soulballad.usage.splitdb.dynamic.datasource.TargetDataSource;
import com.soulballad.usage.splitdb.dynamic.entity.SysUser;
import com.soulballad.usage.splitdb.dynamic.mapper.SysUserMapper;
import com.soulballad.usage.splitdb.dynamic.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name = DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {

        return this.baseMapper.selectById(id);
    }

}
