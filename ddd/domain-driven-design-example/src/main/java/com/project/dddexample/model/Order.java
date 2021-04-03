package com.project.dddexample.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    private Long orderId;
    @OneToMany
    private List<OrderLineItem> orderLineItems = new ArrayList<>();

    public Order() {
    }
}
