package todo5;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import todo5.CSMUtils;

public class CMSMain {

	public CMSMain() {
		// TODO Auto-generated constructor stub
	}
	private static void createNewRestaurant() {
		// TODO Auto-generated constructor stub
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		Session hibernateSession = hibernateFactory.openSession();
	   CSM rst = new CSM(6, 10000, 10, "Java","Ch"); 
	   org.hibernate.Transaction hibernateTransaction = hibernateSession.beginTransaction();
	   hibernateSession.save(rst);
	   hibernateTransaction.commit();
	   hibernateSession.close();
	   hibernateFactory.close();
	   System.out.println("Done");
	}
	
	private static void updateRestaurant() {
		SessionFactory factory = CSMUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<CSM> entityClassType = CSM.class;
		Serializable entityId = 1;//Serializable entityId  = new Integer(101);
		CSM foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = 	session.beginTransaction();
			foundRestaurant.setTitle("Oriental");
			foundRestaurant.setFees(12000);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record updated");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // createNewRestaurant();
       updateRestaurant();
	}

}
