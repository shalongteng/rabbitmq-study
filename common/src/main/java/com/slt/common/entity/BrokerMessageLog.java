package com.slt.common.entity;

import lombok.Data;

import java.util.Date;
@Data
public class BrokerMessageLog {
    private String messageId;

    private String message;

    private Integer tryCount;

    private String status;// 0 发送中 1 成功 2 失败

    private Date nextRetry;

    private Date createTime;

    private Date updateTime;

}

