package com.jellen.springboot.biz.manager.impl;

import com.jellen.springboot.biz.manager.SysUserManager;
import com.jellen.springboot.dao.SysUserMapper;
import com.jellen.springboot.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserManagerImpl implements SysUserManager {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public List<SysUser> queryAllUserList() {
        return sysUserMapper.queryAllUserList();
    }

    @Override
    public SysUser queryUserById(Long id) {
        return sysUserMapper.queryUserById(id);
    }
}
