import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SaveCustomer {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("java");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

//        Customer c2 = new Customer(
//                2,
//                "Om",
//                "ranbir@gmail.com",
//                9812345678L,
//                "Sec-51",12,"Bandra-West ", "Mumbai",true,'M'
//        );       
//        et.begin();
//        em.persist(c2);
//        em.merge(c);      
//        et.commit();
        
        
        Query query =em.createQuery("select s from Customer s");	//JPQL uses Entity class name, NOT table name(from customerdetail  ❌ → should be Customer ✅)
//        Type-safe/generic  list
        List <Customer> li = query.getResultList();
        for(Object c1:li) {
        	Customer c = (Customer)c1;
        	System.out.println(c.getCid()+"\n"+c.getCname()+"\n"+ c.getEmail()+"\n"+c.getPhone()+"\n"+c.getAddress()+"\n"+c.getAge()+"\n"+c.getCity()+"\n"+c.getState()+"\n"+c.getGender()+"\n"+c.isActive());
        }
        
        
//        System.out.println("Customer Saved Successfully");
//
//        em.close();
//        emf.close();
    }
}