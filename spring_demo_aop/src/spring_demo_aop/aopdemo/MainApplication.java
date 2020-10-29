package spring_demo_aop.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_demo_aop.dao.AccountDAO;

public class MainApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		accountDAO.addAccount();
		
		context.close();
	}

}
