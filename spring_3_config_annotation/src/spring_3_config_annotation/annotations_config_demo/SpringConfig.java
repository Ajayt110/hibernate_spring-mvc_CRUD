package spring_3_config_annotation.annotations_config_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Ninjutsu kagebunshinJustu()
	{
		
		return new KagebunshinJustu();
		
	}
	
	@Bean
	public Coach ninjaCoach()
	{
		NinjaCoach myNinjaCoach = new NinjaCoach(kagebunshinJustu());
		return myNinjaCoach;
	}
	
	

}
