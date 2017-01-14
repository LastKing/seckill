package com.ltx.dao;

import com.ltx.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Rain on 2017/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilleDaoTest {
    @Resource
    private SuccessKilledDao successKilleDao;

    /*
    INSERT ignore INTO success_killed(seckill_id,user_phone,state)VALUES (?,?,1)
    Parameters: 1000(Long), 13502181282(Long)
    Updates: 1
     */
    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1000L;
        long phone = 13502181282L;
        int insertCount = successKilleDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount=" + insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1000L;
        long phone = 13502181282L;
        SuccessKilled successKilled = successKilleDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
        /*
        SuccessKilled{seckillId=1000, userPhone=13502181282, state=1, createTime=Sat Jan 14 12:37:17 CST 2017}
        Seckill{seckillId=1000, name='1000元秒杀iphone6', number=0, startTime=Sun Nov 01 00:00:00 CST 2015, endTime=Mon Nov 02 00:00:00 CST 2015, createTime=Sat Jan 14 11:30:29 CST 2017}
         */
    }

}