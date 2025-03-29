package com.anmory.order.model;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午9:56
 */


@Data
public class OrderInfo {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer num;
    private BigInteger price;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
    private ProductInfo productInfo;
}
