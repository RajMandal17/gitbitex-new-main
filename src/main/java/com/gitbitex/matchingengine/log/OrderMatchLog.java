package com.gitbitex.matchingengine.log;

import java.math.BigDecimal;


import com.gitbitex.enums.OrderSide;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderMatchLog extends OrderLog {
    private String productId;
    private long sequence;
    private long tradeId;
    private String takerOrderId;
    private String makerOrderId;
    private String takerUserId;
    private String makerUserId;
    private OrderSide side;
    private BigDecimal price;
    private BigDecimal size;
    private BigDecimal funds;

    public OrderMatchLog() {
        this.setType(LogType.ORDER_MATCH);
    }

}
