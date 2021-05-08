package com.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ShoppingCartJava {
    List<String> orders = new ArrayList<>();

    void addItem(String name, int qty) {
        orders.add(String.format("order. Item: %s qty: %d%n", name, qty));
    }

    String checkout() {
        String msg = placeOrders();
        orders.clear();
        return msg;
    }

    String placeOrders() {
        return orders.size() + " orders placed";
    }
}