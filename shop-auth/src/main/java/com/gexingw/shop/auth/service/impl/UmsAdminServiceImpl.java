package com.gexingw.shop.auth.service.impl;

import com.gexingw.shop.auth.service.UmsAdminService;
import com.gexingw.shop.common.entity.UmsAdmin;
import com.gexingw.shop.common.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 17:24
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdmin getById(long id) {
        return umsAdminMapper.findById(id);
    }
}
