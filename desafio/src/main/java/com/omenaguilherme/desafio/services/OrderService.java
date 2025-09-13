package com.omenaguilherme.desafio.services;

import com.omenaguilherme.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ShippingService{

    public double total(Order order){
        return (order.getBasic() - (order.getBasic() * order.getDiscount()/100)) + shipment(order);
    }

}
