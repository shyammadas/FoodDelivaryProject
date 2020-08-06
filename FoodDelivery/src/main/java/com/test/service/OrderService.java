package com.test.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.test.model.Order;
import com.test.model.OrderStatusUpdateMessage;

public interface OrderService {

	Order placeOrder(Order order);
	
	Order findOrderId(int orderId);

	List<Order> findByUserId(String userId);
	
    void updateOrderStatus(int orderId, OrderStatusUpdateMessage orderStatusUpdateMessage);

}
