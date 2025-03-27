package com.anmory.product.mapper;

import com.anmory.product.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:18
 */

@Mapper
public interface ProductMapper {
    @Select("select * from product_detail where id = #{id}")
    ProductInfo selectProductById(Integer id);
}
