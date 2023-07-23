/*
package mission.가독성과_재사용성을_위해_ENUM_DATETIME_OPTONAL;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Customer customer;
    private String orderDate;
    private String status;
    private List<OrderItem> orderItems;

    public class Order {
        private int id;
        private Optional<Customer> customer;
        private LocalDate orderDate;
        private OrderStatus status;
        private Optional<List<OrderItem>> orderItems;

        public Order(int id, Customer customer, LocalDate orderDate, OrderStatus status, List<OrderItem> orderItems) {
            this.id = id;
            this.customer = Optional.ofNullable(customer);
            this.orderDate = orderDate;
            this.status = status;
            this.orderItems = Optional.ofNullable(orderItems);
        }

        public OrderStatus getStatus() {
            return status;
        }

        public Optional<Customer> getCustomer() {
            return customer;
        }

        public Optional<List<OrderItem>> getOrderItems() {
            return orderItems;
        }
    }*/
