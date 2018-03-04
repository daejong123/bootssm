package com.dottie.helloworld.controller;

import com.dottie.helloworld.entity.StuEntity;
import com.dottie.helloworld.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @Autowired
    private StuService stuService;

    /**
     * 映射首页
     * @return
     */
    @GetMapping(value = "/")
    public String index() {
        System.out.println("ni hao welcome ....");
        return "index";
    }

    /**
     * 测试是否和本地数据库连通
     */
    @GetMapping(value = "/find/{id}")
    @ResponseBody
    public StuEntity find(@PathVariable("id") String id) throws Exception {
        return stuService.selectById(id);
    }
}
