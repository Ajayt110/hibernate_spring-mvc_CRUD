package spring_demo_aop.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("spring_demo_aop.dao, spring_demo_aop.aspect")
public class DemoConfig {

}