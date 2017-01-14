package com.ltx.dao;

import com.ltx.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by toonew on 2017/1/14.
 */
public interface SuccessKilleDao {
    /**
     * 插入购买明细,可过滤重复(数据库有联合主键)
     *
     * @param seckilledId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckilledId") long seckilledId, @Param("userPhone") long userPhone);

    /**
     * 根据ID查询SuccessKilled并携带秒杀产品对象实体
     *
     * @param seckilledId
     * @param userPhone
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckilledId") long seckilledId, @Param("userPhone") long userPhone);
}
