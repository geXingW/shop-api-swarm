package com.gexingw.shop.port.controller;

import com.gexingw.shop.port.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/8
 * @time: 15:41
 */
@RestController
@RequestMapping
public class IndexController {

    @Autowired
    UmsMemberService memberService;

    @GetMapping
    public String index() {
        return "Port index page.";
    }

    @GetMapping("/member/{id}")
    public Object member(@PathVariable long id) {
        return memberService.findById(id);
    }
}
