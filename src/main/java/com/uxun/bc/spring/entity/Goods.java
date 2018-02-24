package com.uxun.bc.spring.entity;

import java.io.Serializable;

/**
 * Created by 欧阳爱东 on 2018/2/24.
 */
public class Goods implements Serializable{
    private Integer goodsId;
    private String goodsName;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
