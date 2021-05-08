package com.example

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ShoppingCart {
    List<Item> orders = []

    void addItem(String name, int qty) {
    	orders << new Item(name: name, qty: qty)
    }

    String checkout() {
        def msg = placeOrders()
        orders.clear()
        msg
    }

    String placeOrders() {
        "${orders.size()} orders placed"
    }
}