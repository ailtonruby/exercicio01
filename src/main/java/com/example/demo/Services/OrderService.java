package com.example.demo.Services;

import com.example.demo.Order.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public ShippingService ShippingService;

    public OrderService(com.example.demo.Services.ShippingService shippingService) {
        this.ShippingService = shippingService;
    }

    public double Service(Order order){
        return (order.getBasic() - (order.getBasic() * (order.getDiscount()/100))) + ShippingService.Shipping(order.getBasic());
    }
}
