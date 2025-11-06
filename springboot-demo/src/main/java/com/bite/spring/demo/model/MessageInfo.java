package com.bite.spring.demo.model;

import lombok.*;

import java.util.Date;

@Data
public class MessageInfo {
    private Integer id;
    private String from;
    private String to;
    private String message;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
}
