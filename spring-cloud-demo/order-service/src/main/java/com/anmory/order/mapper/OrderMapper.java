package com.anmory.order.mapper;

import com.anmory.order.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午9:58
 */

@Mapper
public interface OrderMapper {
    @Select("select * from order_detail where id = #{id}")
    OrderInfo selectOrderById(Integer id);
}
