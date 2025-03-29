package com.anmory.order.controller;

import com.anmory.order.model.OrderInfo;
import com.anmory.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:03
 */

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/{id}")
    public OrderInfo getOrderInfo(@PathVariable("id") Integer id) {
        return orderService.getOrderByUserId(id);
    }
}
