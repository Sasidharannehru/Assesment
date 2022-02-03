package com.sasi.productDatabase;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        Get the SessionFactory
    	SessionFactory factory = new Configuration()
    								.configure("config.xml")
    								.addAnnotatedClass(Product.class)
    								.buildSessionFactory();
    	
//    	Get the Session
    	Session theSession = factory.getCurrentSession();
    	
    	try {

    		Product theProduct = new Product("watch", 20);
    		
//    		Start the transaction
    		theSession.beginTransaction();
    		

    		theSession.save(theProduct);
    		

    		theSession.getTransaction().commit();
    		
    		
    		
    	}finally {
    		factory.close();
    	}
    }
}
