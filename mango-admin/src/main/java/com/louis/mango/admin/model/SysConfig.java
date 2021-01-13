package com.louis.mango.admin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sys_config")
public class SysConfig {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String value;

    private String label;

    private String type;

    private String description;

    private Long sort;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private String remarks;

    private Byte delFlag;

}