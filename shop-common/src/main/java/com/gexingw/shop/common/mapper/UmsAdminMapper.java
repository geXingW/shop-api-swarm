package com.gexingw.shop.common.mapper;

import com.gexingw.shop.common.entity.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/9
 * @time: 17:06
 */
@Mapper
public interface UmsAdminMapper {

    /**
     * 根据id查询管理员信息
     *
     * @param id 管理员ID
     * @return 管理员信息
     */
    UmsAdmin findById(@Param("id") long id);
}
