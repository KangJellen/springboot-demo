package com.jellen.springboot.service;

import com.jellen.springboot.model.SysUser;

/**
 * dubbo对外接口
 */
public interface SysUserService {

    SysUser getUserById(Long id);
}
