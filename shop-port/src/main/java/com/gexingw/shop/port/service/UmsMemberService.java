package com.gexingw.shop.port.service;

import com.gexingw.shop.common.entity.UmsMember;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 20:36
 */
public interface UmsMemberService {

    /**
     *
     * 根据Id查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UmsMember findById(long id);
}
