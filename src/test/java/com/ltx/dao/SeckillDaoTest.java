package com.ltx.dao;

import com.ltx.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by toonew on 2017/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {

    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.toString());
    }

    // Java没有保存形参的记录:QueryAll(int offset,int limit)->QueryAll(arg0,arg1);
    // 因为java形参的问题,多个基本类型参数的时候需要用@Param("seckillId")注解区分开来
    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }

    /*
     12:28:44.866 [main] DEBUG o.m.s.t.SpringManagedTransaction -
     JDBC Connection [com.mchange.v2.c3p0.impl.NewProxyConnection@3e2fc448] will not be managed by Spring
     UPDATE seckill
     set number = number -1
     where seckill_id = ? AND start_time <= ? AND end_time >= ? AND number >0;
     Parameters: 1000(Long), 2017-01-14 12:28:44.442(Timestamp), 2017-01-14 12:28:44.442(Timestamp)
     Updates: 0
     */
    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L, killTime);
        System.out.println("updateCount=" + updateCount);
    }


}