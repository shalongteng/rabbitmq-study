package com.slt.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 要实现Serializable 接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private int id;
    private String name;
    private String messageId;

}
