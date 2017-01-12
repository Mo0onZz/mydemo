package com.hehaha.config.security.service;

import com.hehaha.config.security.dao.SysUserDao;
import com.hehaha.config.security.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService
 *
 * @author wu
 * @create 2017-01-12 14:05
 */
@Service
public class UserService {
    @Resource
    private SysUserDao sysUserDao;

    public SysUser findByName(String userName) {

        return sysUserDao.findByName(userName);
    }
}