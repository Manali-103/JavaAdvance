package todo5;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CSMUtils {
		// this is a utility class for obtaining SessionFactory.
		public static SessionFactory getSessionFactory() {
			System.out.println("Configuring Hibernate Programatically...");
			Configuration hibernateConfig = new Configuration();
			//hibernateConfig = hibernateConfig.configure();
			
			//Specifying the Entity class
			Class<CSM> entityClass = CSM.class;
			hibernateConfig.addAnnotatedClass(entityClass);//this is equivalent to mapping resource = "Restaurant.hbm.xml"
			
			//Specifying the properties
			Properties hibernateProps = new Properties();
			hibernateProps.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			hibernateProps.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/Cdac_Nov_23?useSSL=false");
			hibernateProps.put("hibernate.connection.username", "root");
			hibernateProps.put("hibernate.connection.Password", "root");
			hibernateProps.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			hibernateProps.put("hibernate.connection.show_sql", "true");
			hibernateProps.put("hibernate.hbm2ddl.auto", "update");
			
			hibernateConfig.setProperties(hibernateProps);
			
			SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
			return hibernateFactory;
		}

}
