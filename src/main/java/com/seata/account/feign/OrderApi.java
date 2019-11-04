package com.seata.account.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:32
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@FeignClient(value = "seata-order")
public interface OrderApi {

    /**
     * 修改订单金额
     * @param userId
     * @param money
     * @param status
     * @return
     */
    @RequestMapping("/order/update")
    String update(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money, @RequestParam("status") Integer status);
}
