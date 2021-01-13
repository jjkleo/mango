package com.louis.mango.admin.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "sys_login_log")
public class SysLoginLog {

    @Id
    private Long id;

    private String userName;

    private String status;

    private String ip;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

}