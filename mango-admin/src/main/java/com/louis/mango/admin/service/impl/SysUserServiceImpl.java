package com.louis.mango.admin.service.impl;

import java.util.List;

import com.louis.mango.admin.dao.SysUserRepository;
import com.louis.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.admin.model.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }
}