package com.omenaguilherme.desafio.services;

import com.omenaguilherme.desafio.entities.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ShippingService {

    public double shipment(Order order){
        double ship;
        if (order.getBasic() < 100.00){
            ship = 20.0;
            return ship;
        }
        else if (order.getBasic() >= 100 && order.getBasic() <= 200.00){
            ship = 12.0;
            return ship;
        }
        return 0;
    }
}
