package day6.beans;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import day5.beans.Restaurant;
import day6.utils.HibernateUtils;

public class HibernateCrudMain {
	public HibernateCrudMain() {
		
	}

	private static void createNewRestaurant() {
		// TODO Auto-generated constructor stub
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		Session hibernateSession = hibernateFactory.openSession();
	   Restaurant rst = new Restaurant(7, "Manali","Choclate", 11); 
	   org.hibernate.Transaction hibernateTransaction = hibernateSession.beginTransaction();
	   hibernateSession.save(rst);
	   hibernateTransaction.commit();
	   hibernateSession.close();
	   hibernateFactory.close();
	   System.out.println("Done");
	}
	
   private static void showRestaurantAgain() {
	SessionFactory factory = HibernateUtils.getSessionFactory();
	Session session = factory.openSession();
	 Class<Restaurant> entityClassType = Restaurant.class;
	 Serializable entityId = 1;
	 Restaurant foundRestaurant = session.load(entityClassType, entityId);
	 System.out.println(foundRestaurant.getClass().getName());
		
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getRestaurantId());
		System.out.println(foundRestaurant.getCuisine());
		System.out.println(foundRestaurant.getName());
	}
    private static void deleteRestaurant() {
	SessionFactory factory = HibernateUtils.getSessionFactory();
	Session session = factory.openSession();
	Class<Restaurant> entityClassType = Restaurant.class;
	Serializable entityId = 6;
	//Serializable entityId  = new Integer(101);
	Restaurant foundRestaurant = session.load(entityClassType, entityId);
	
	Transaction tx = session.beginTransaction();
		session.delete(foundRestaurant);
	tx.commit();
	session.close();
	factory.close();
	System.out.println("Record deleted");
}
    private static void showOneRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		//Specifying the entity specific Class type using a reference of type 'Class' class
		Class<Restaurant> entityClassType = Restaurant.class;
		//Class<Employee> type = Employee.class;
		
		//Specifying the identity in the form of java.io.Serializable
		Serializable entityId = 5;//Serializable entityId  = new Integer(101);
		
		
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant);
		session.close();
		factory.close();
		
		
	}
    
    private static void updateRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 1;//Serializable entityId  = new Integer(101);
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = 	session.beginTransaction();
			foundRestaurant.setCuisine("Oriental");
			foundRestaurant.setBranchCount(12);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record updated");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // createNewRestaurant();
         //showRestaurantAgain();
         //deleteRestaurant();
         //showOneRestaurant();
		updateRestaurant();
	}

}
