package com.goldeasy.user.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author: adminisrator
 * @date: 2018/11/19
 * @description:
 */
public class UserMarkVO implements Serializable {


    /**
     * 积分余额
     */
    private BigDecimal markAmount;
    /**
     * 用户积分任务列表
     */
    private List<MarkTaskVO> markTaskList;

    public BigDecimal getMarkAmount() {
        return markAmount;
    }

    public void setMarkAmount(BigDecimal markAmount) {
        this.markAmount = markAmount;
    }

    public List getMarkTaskList() {
        return markTaskList;
    }

    public void setMarkTaskList(List markTaskList) {
        this.markTaskList = markTaskList;
    }

    @Override
    public String toString() {
        return "UserMarkVO{" +
                "markAmount=" + markAmount +
                ", markTaskList=" + markTaskList +
                '}';
    }
}
