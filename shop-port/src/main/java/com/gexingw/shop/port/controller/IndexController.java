package com.gexingw.shop.port.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public String index(){
        return "Port index page.";
    }
}
