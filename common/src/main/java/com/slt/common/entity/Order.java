package com.slt.common.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * 要实现Serializable 接口
 */
@Data
public class Order implements Serializable {
    private int id;
    private String name;
    private String messageId;

}
