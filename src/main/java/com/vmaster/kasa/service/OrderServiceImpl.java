package com.vmaster.kasa.service;

import com.vmaster.kasa.model.Order;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;
@Stateless
public class OrderServiceImpl implements OrderService{

    @Inject
    EntityManager entityManager;

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> findByDate(LocalDate start, LocalDate end) {
        entityManager.createNativeQuery(Order.ORDER_FIND_ALL, Order.class);
        return null;
    }
}
