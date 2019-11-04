package com.seata.account.service.impl;

import com.seata.account.feign.OrderApi;
import com.seata.account.mapper.AccountMapper;
import com.seata.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:25
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private OrderApi orderApi;

    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->扣减账户开始account中");
        //模拟超时异常，全局事务回滚
//        try {
//            Thread.sleep(30*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountMapper.decrease(userId,money);
        log.info("------->扣减账户结束account中");

//        //修改订单状态，此调用会导致调用成环
//        log.info("修改订单状态开始");
//        String mes = orderApi.update(userId, money.multiply(new BigDecimal("0.09")),0);
//        log.info("修改订单状态结束：{}",mes);

    }
}
