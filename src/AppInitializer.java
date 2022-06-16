import lk.ijse.supermarket_orm.entity.Item;
import lk.ijse.supermarket_orm.entity.Order;
import lk.ijse.supermarket_orm.entity.OrderDetail;
import lk.ijse.supermarket_orm.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    private static Object Item;

    public static void main(String[] args) {

      /*Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Nimal");
        c1.setContact("071-4589624");
        c1.setAddress("Galle");*/

        /*Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("Amali");
        c2.setContact("075-4589624");
        c2.setAddress("Panadura");*/

       /* Item i2 = new Item();
        i2.setCode("I002");
        i2.setDescription("Soap");
        i2.setUnitPrice(90);
        i2.setQty(1);

        Item i3 = new Item();
        i3.setCode("I003");
        i3.setDescription("Anchor");
        i3.setUnitPrice(1020);
        i3.setQty(1);

        Order o1 = new Order();
        o1.setOrderId("O001");
        o1.setCustomerId("C001");
        o1.setCost(560);

        Order o2 = new Order();
        o2.setOrderId("O002");
        o2.setCustomerId("C001");
        o2.setCost(1020);

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(o1);
        orderList.add(o2);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(i2);
        itemList.add(i3);

        i2.setOrderList(orderList);
        i3.setOrderList(orderList);

        o1.setItemList(itemList);
        o2.setItemList(itemList);*/

        OrderDetail od1 = new OrderDetail();
        od1.setId("OD-001");
        od1.setQty(1);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*session.save(i2);
        session.update(i2);
        Customer c2 = session.get(Customer.class,"C002");
        session.delete(c2);
        Item i2 = session.get(Item.class,"I002");
        session.delete(i2);
        System.out.println(i2);*/

        /*session.save(i2);
        session.save(i3);
        session.save(o1);
        session.save(o2);*/

        session.save(od1);

        transaction.commit();
        session.close();

    }
}
