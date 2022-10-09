package com.gexingw.shop.common.mapper;

import com.gexingw.shop.common.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 20:33
 */
@Mapper
public interface UmsMemberMapper {

    /**
     * 根据Id查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UmsMember findById(long id);
}
