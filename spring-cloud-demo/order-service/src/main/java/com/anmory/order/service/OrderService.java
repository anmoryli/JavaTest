package com.anmory.order.service;

import com.anmory.order.mapper.OrderMapper;
import com.anmory.order.model.OrderInfo;
import com.anmory.order.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:00
 */

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;
    public OrderInfo getOrderByUserId(Integer id) {
        OrderInfo orderInfo = orderMapper.selectOrderById(id);
        String url = "http://localhost:9090/product/" + orderInfo.getProductId();
        ProductInfo productInfo = restTemplate.getForObject(url, ProductInfo.class);
        orderInfo.setProductInfo(productInfo);
        return orderInfo;
    }
}
