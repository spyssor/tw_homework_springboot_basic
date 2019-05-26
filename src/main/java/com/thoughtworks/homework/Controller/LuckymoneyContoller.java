package com.thoughtworks.homework.Controller;

import com.thoughtworks.homework.Dao.LuckymoneyRepository;
import com.thoughtworks.homework.Entity.Luckymoney;
import com.thoughtworks.homework.Service.LuckymoneyService;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LuckymoneyContoller {

    @Autowired
    private LuckymoneyRepository repository;

    @Autowired
    private LuckymoneyService service;

    /**
     * 获取红包列表
     */
    @GetMapping("/list")
    public List<Luckymoney> list() {
        return repository.findAll();
    }

    /**
     * 创建红包
     */
    @PostMapping("/create")
    public Luckymoney create(Luckymoney luckymoney){
        Luckymoney res = repository.save(luckymoney);
        return res;
    }

    /**
     * 通过id查询红包
     */
    @GetMapping("/query/{id}")
    public Luckymoney query(@PathVariable("id") Integer id) {
        return repository.findById(id).orElse(null);
    }


    /**
     * 更新红包(领红包)
     */
    @PutMapping("/upgrade/{id}")
    public Luckymoney upgrade(@PathVariable("id") Integer id, @RequestParam("consumer") String consumer) {
        Optional<Luckymoney> optional = repository.findById(id);
        if (optional.isPresent()){
            Luckymoney luckymoney = optional.get();
            luckymoney.setConsumer(consumer);
            return repository.save(luckymoney);
        }

        return null;
    }

    /**
     * 事务 发送两个红包，要不全成功，要不全失败
     */
    @PostMapping("/sendTwo")
    public void createTwo() {
        service.createTwo();
    }
}
