package lk.ijse.supermarket_orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Item_Detail")
public class Item {
    @Id
    private String code;
    private String description;
    private double unitPrice;
    private int qty;

    @ManyToMany
    private List<Order> orderList = new ArrayList<>();

    public Item() {
    }

    public Item(String code, String description, double unitPrice, int qty) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.orderList = orderList;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    public List<Order> getOrderList() { return orderList; }

    public void setOrderList(List<Order> orderList) { this.orderList = orderList; }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                ", orderList=" + orderList +
                '}';
    }
}

