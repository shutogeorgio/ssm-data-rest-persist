package com.uwaai.datareststastemachine.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private OrderState state;

    public Order(OrderState state) {
        this.state = state;
    }

    public Order() {
        this.state = null;
    }
}
