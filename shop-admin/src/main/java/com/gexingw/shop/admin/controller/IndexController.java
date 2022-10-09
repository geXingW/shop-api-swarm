package com.gexingw.shop.admin.controller;

import com.gexingw.shop.admin.service.UmsAdminService;
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
 * @time: 15:43
 */
@RestController
@RequestMapping
public class IndexController {

    @Autowired
    UmsAdminService adminService;

    @GetMapping
    public String index() {
        return "Admin index page";
    }

    @GetMapping("/admin/{id}")
    public Object admin(@PathVariable long id) {
        return adminService.findById(id);
    }
}
