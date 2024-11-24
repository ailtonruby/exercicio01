package com.example.demo.Services;

import org.springframework.stereotype.Component;

@Component
public class ShippingService {
    public double Shipping(double order){
        if (order > 200 ){
            return 0;
        } else if (order >= 100.0) {
            return 12;
        }else if (order < 100.0) {
            return 20;
        }
        return 0;
    }
}
