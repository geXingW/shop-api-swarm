package com.gexingw.shop.auth.service;

import com.gexingw.shop.common.entity.UmsAdmin;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 17:23
 */
public interface UmsAdminService {

   /**
    * 根据id查询管理员信息
    *
    * @param id 管理员ID
    * @return 管理员信息
    */
   UmsAdmin getById(long id);
}
