package com.jellen.springboot.dao;

import com.jellen.springboot.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    int insert(SysUser sysUser);

    List<SysUser> queryAllUserList();

    SysUser queryUserById(Long id);
}
