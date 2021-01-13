package com.louis.mango.admin.dao;

import com.louis.mango.admin.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {

}
