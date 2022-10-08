package com.gexingw.shop.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/8
 * @time: 15:42
 */
@RestController
@RequestMapping
public class IndexController {

    @GetMapping
    public String index(){
        return "Auth service index page.";
    }
}
