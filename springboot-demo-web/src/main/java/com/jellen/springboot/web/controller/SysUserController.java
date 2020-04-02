package com.jellen.springboot.web.controller;

import com.jellen.springboot.biz.manager.SysUserManager;
import com.jellen.springboot.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserManager sysUserManager;

    @RequestMapping("test")
    @ResponseBody
    public String test(SysUser sysUser){
        return "success";
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insert(SysUser sysUser){
         sysUserManager.insert(sysUser);
         return "success";
    }

    @RequestMapping("queryUserById")
    @ResponseBody
    public SysUser queryUserById(long userId){
        return sysUserManager.queryUserById(userId);
    }

    @RequestMapping("queryAllUserList")
    @ResponseBody
    public List<SysUser> queryAllUserList(){
        return sysUserManager.queryAllUserList();
    }
}
