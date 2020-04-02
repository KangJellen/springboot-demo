package com.jellen.springboot.biz.manager;

import com.jellen.springboot.model.SysUser;

import java.util.List;

public interface SysUserManager {

    int insert(SysUser sysUser);

    List<SysUser> queryAllUserList();

    SysUser queryUserById(Long id);
}
