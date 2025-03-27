package com.anmory.product.controller;

import com.anmory.product.model.ProductInfo;
import com.anmory.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:21
 */

@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/{id}")
    public ProductInfo getOrderInfo(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }
}
