package com.gexingw.shop.admin.service.impl;

import com.gexingw.shop.admin.service.UmsAdminService;
import com.gexingw.shop.common.entity.UmsAdmin;
import com.gexingw.shop.common.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 20:19
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdmin findById(long id) {
        return umsAdminMapper.findById(id);
    }
}
