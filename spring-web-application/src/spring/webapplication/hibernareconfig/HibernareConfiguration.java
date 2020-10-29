package spring.webapplication.hibernareconfig;

import java.util.*;


import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import spring.webapplication.dto.User;

@Configuration
public class HibernareConfiguration {
	
	@Bean
	public SessionFactory getSessionFactory()
	{
		
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
			
			Properties properties = new Properties();
			properties.setProperty("hibernate.connection.driver_class","com.microsoft.sqlserver.jdbc.SQLServerDriver");
			properties.setProperty("hibernate.connection.url", "jdbc:sqlserver://localhost:1433;databaseName=JavaWebDataBase");
			properties.setProperty("hibernate.connection.username", "Ajay");
			properties.setProperty("hibernate.connection.password", "1101");
			properties.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
			properties.setProperty("hibernate.hbm2ddl.auto", "create");
			properties.setProperty("hibernate.show_sql", "true");
			
			configuration.setProperties(properties);
			
			configuration.addAnnotatedClass(User.class);
			
			return configuration.buildSessionFactory();
	
		}
	

}
