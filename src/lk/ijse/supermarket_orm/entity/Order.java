package lk.ijse.supermarket_orm.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Order_Detail")
public class Order {
    @Id
    private String OrderId;
    @CreationTimestamp
    private Date OrderDate;
    private String CustomerId;
    private double cost;

    @ManyToMany(mappedBy = "orderList")
    private List<Item> itemList = new ArrayList<>();

    public Order() {
    }

    public Order(String orderId, Date orderDate, String customerId, double cost, List<Item> itemList) {
        OrderId = orderId;
        OrderDate = orderDate;
        CustomerId = customerId;
        this.cost = cost;
        this.itemList = itemList;
    }

    public String getOrderId() { return OrderId; }
    public void setOrderId(String orderId) { OrderId = orderId; }

    public Date getOrderDate() { return OrderDate; }
    public void setOrderDate(Date orderDate) { OrderDate = orderDate; }

    public String getCustomerId() { return CustomerId; }
    public void setCustomerId(String customerId) { CustomerId = customerId; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public List<Item> getItemList() { return itemList; }
    public void setItemList(List<Item> itemList) { this.itemList = itemList; }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId='" + OrderId + '\'' +
                ", OrderDate='" + OrderDate + '\'' +
                ", CustomerId='" + CustomerId + '\'' +
                ", cost=" + cost +
                ", itemList=" + itemList +
                '}';
    }
}
