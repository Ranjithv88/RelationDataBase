package com.SpringBoot.RelationDataBase.Service;

import com.SpringBoot.RelationDataBase.Model.Orders;
import com.SpringBoot.RelationDataBase.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository ;

    public List<Orders> OrdersGetApi() {
        return ordersRepository.findAll();
    }

    public String OrdersPostApi(Orders order) {
        ordersRepository.save(order);
        return " Orders Record Saved ! ";
    }

    public String OrdersPutApi(Orders order) {
        ordersRepository.save(order);
        return " Orders Record Update ! ";
    }

    public String OrdersDeleteApi(long orderId) {
        ordersRepository.deleteById(orderId);
        return " Delete Record Successfully !";
    }

    public String OrdersDeleteListApi(List<Long> ordersId) {
        for(Long orders :ordersId) {
            ordersRepository.deleteById(orders);
        }
        return " List of ID Deleted Successfully !";
    }

}

