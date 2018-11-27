package tech.wetech.weshop.enums;

public enum  OrderStatusEnum {

    SUBMIT_ORDER("提交订单"),
    WAREHOUSE_DISTRIBUTION("仓库配货"),
    COMMODITY_OUT("商品出库"),
    WAITING_FOR_RECEIPT("等待收货"),
    COMPLETE("完成"),
    PENDING_RETURN("待退货"),
    RETURNED("已退货");

    private String name;

    OrderStatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}