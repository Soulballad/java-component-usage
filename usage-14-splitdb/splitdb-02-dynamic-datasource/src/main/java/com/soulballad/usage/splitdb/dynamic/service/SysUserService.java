package com.soulballad.usage.splitdb.dynamic.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soulballad.usage.splitdb.dynamic.entity.SysUser;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 */
public interface SysUserService extends IService<SysUser> {

    SysUser findUserByFirstDb(long id);

    SysUser findUserBySecondDb(long id);

}
