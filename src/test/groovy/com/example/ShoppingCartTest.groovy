package com.example

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
class ShoppingCartTest {

    @Autowired
    ShoppingCart shoppingCart

    @Test
    void testCheckout() {
        shoppingCart.addItem("Item1", 3)
        shoppingCart.addItem("item2", 5)
        String result = shoppingCart.checkout()
        println("Shopping cart checkout response: $result")
        assertEquals("2 orders placed", result)
    }
}