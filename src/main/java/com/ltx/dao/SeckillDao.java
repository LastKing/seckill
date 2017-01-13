package com.ltx.dao;

import com.ltx.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by toonew on 2017/1/14.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果更新行数大于1,表示更新的行数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id 查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);


    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet, int limit);
}
