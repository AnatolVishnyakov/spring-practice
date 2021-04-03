package com.project.dddexample.event;

import com.project.dddexample.model.DeliveryInformation;
import com.project.dddexample.model.OrderLineItem;
import com.project.dddexample.model.PaymentInformation;

import java.util.List;

public class OrderCreated implements OrderDomainEvent {
    private List<OrderLineItem> lineItems;
    private DeliveryInformation deliveryInformation;
    private PaymentInformation paymentInformation;
    private long restaurantId;
    private String restaurantName;
}
