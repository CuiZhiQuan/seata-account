package com.seata.account.service;

import java.math.BigDecimal;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:25
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
