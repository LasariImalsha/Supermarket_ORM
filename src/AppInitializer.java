import lk.ijse.supermarket_orm.entity.Customer;
import lk.ijse.supermarket_orm.entity.Item;
import lk.ijse.supermarket_orm.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

       /*Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Nimal");
        c1.setContact("071-4589624");
        c1.setAddress("Galle");*/

        Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("Amali");
        c2.setContact("075-4589624");
        c2.setAddress("Panadura");

        /*Item i1 = new Item();
        i1.setCode("I001");
        i1.setDescription("Dhal 1kg");
        i1.setUnitPrice(560.00);
        i1.setQty(1);*/

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        //session.save(c2);
        //session.update(c2);
        transaction.commit();
        session.close();

    }
}
