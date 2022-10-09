package com.gexingw.shop.port.service.impl;

import com.gexingw.shop.common.entity.UmsMember;
import com.gexingw.shop.common.mapper.UmsMemberMapper;
import com.gexingw.shop.port.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 20:37
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public UmsMember findById(long id){
        return umsMemberMapper.findById(id);
    }
}
