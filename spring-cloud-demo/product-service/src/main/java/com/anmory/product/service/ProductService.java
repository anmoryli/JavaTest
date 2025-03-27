package com.anmory.product.service;

import com.anmory.product.mapper.ProductMapper;
import com.anmory.product.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:19
 */

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    public ProductInfo getProductById(Integer id) {
        return productMapper.selectProductById(id);
    }
}
