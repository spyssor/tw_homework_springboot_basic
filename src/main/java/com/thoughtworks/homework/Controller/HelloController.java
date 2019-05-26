package com.thoughtworks.homework.Controller;

import com.thoughtworks.homework.Config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam("id") Integer id) {

//        return "说明:" + limitConfig.getDescription();
        return "id : " + id;
    }
}
