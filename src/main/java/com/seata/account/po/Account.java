package com.seata.account.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:24
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Data
public class Account {

    private Long id;

    /**用户id*/
    private Long userId;

    /**总额度*/
    private BigDecimal total;

    /**已用额度*/
    private BigDecimal used;

    /**剩余额度*/
    private BigDecimal residue;
}
