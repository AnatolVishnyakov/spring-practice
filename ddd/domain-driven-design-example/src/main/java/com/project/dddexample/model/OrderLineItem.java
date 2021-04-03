package com.project.dddexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OrderLineItem {
    @Id
    private Long id;
}
