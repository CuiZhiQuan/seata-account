package com.seata.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:29
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Mapper
public interface AccountMapper {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    @Update({
            "update account set residue = residue - #{money},used = used + #{money} where user_id = #{userId};"
    })
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
