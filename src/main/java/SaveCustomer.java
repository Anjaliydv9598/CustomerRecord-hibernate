import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomer {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("java");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        Customer c = new Customer(
                1,
                "Anjali",
                "anjali@gmail.com",
                9876543210L,
                "Sec-14",12,"gurgaon", "Haryana",true,'F'
        );

       
        et.begin();

        em.persist(c);

        et.commit();

        System.out.println("Customer Saved Successfully");

        em.close();
        emf.close();
    }
}