package br.edu.ifpb.padroes.domain;

import java.time.Instant;
import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private Instant creationDate;
    private Restaurant restaurant;
    private List<OrderItem> orderItemList;
    private OrderStatus status = OrderStatus.IN_PROGRESS;

    public enum OrderStatus {
        IN_PROGRESS, CANCELED, PAYMENT_SUCCESS, PAYMENT_REFUSED
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
