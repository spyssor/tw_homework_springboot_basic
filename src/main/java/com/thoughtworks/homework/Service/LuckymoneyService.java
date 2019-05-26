package com.thoughtworks.homework.Service;

import com.thoughtworks.homework.Dao.LuckymoneyRepository;
import com.thoughtworks.homework.Entity.Luckymoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 事务 指数据库事务
     */
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("胡宇帆");
        luckymoney1.setConsumer("王晓婵");
        luckymoney1.setMoney(new BigDecimal(520));

        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("胡宇帆");
        luckymoney2.setConsumer("王晓婵");
        luckymoney2.setMoney(new BigDecimal(1314));

        repository.save(luckymoney2);
    }
}
