package com.anmory.order.model;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-27 下午10:09
 */

@Data
public class ProductInfo {
    private Integer id;
    private String productName;
    private BigInteger productPrice;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}
