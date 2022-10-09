package com.gexingw.shop.admin.service;

import com.gexingw.shop.common.entity.UmsAdmin;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 20:19
 */
public interface UmsAdminService {

    /**
     * 根据Id查询管理员信息
     *
     * @param id 管理员ID
     * @return 管理员信息
     */
    UmsAdmin findById(long id);
}
