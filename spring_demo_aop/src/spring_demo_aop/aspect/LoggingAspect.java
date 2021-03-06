package spring_demo_aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	

		@Before("execution(public void addAccount())")
		public void beforeAdvice()
		{
			System.out.println("\n=======>>> Executing Before Advice.");
		}
}
