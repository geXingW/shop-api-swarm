package com.gexingw.shop.auth.controller;

import com.gexingw.shop.auth.service.UmsAdminService;
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
 * @time: 15:42
 */
@RestController
@RequestMapping
public class IndexController {

    @Autowired
    UmsAdminService umsAdminService;

    @GetMapping
    public String index() {
        return "Auth service index page.";
    }

    @GetMapping("/admin/{id}")
    public Object admin(@PathVariable long id) {

        return umsAdminService.getById(id);
    }

}
