package com.vmaster.kasa.service;

import com.vmaster.kasa.model.Order;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    Order updateOrder(Order order);

    List<Order> findByDate(LocalDate start, LocalDate end);
}
