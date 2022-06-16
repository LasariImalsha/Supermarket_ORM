package lk.ijse.supermarket_orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OrderDetail {

    @Id
    private String id;
    @OneToMany
    private Order order;
    @OneToMany
    private Item item;
    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(String id, Order order, Item item, int qty) {
        this.id = id;
        this.order = order;
        this.item = item;
        this.qty = qty;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", item=" + item +
                ", qty=" + qty +
                '}';
    }
}
