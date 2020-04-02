package com.jellen.springboot.biz.export;

import com.jellen.springboot.biz.manager.SysUserManager;
import com.jellen.springboot.model.SysUser;
import com.jellen.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * dubbo对外接口实现类
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserManager sysUserManager;

    @Override
    public SysUser getUserById(Long id) {
        return sysUserManager.queryUserById(id);
    }
}
