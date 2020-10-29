package spring_3_config_annotation.annotations_config_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NinjaCoach implements Coach {

	private Ninjutsu ninjutsu;
	
	@Autowired
	public NinjaCoach(Ninjutsu theNinjutsu) {
		
		ninjutsu = theNinjutsu;
	}
	
	public NinjaCoach() {
		super();
	}

	@Override
	public String coachName() {
		
		return "Coach name is Kakashi Hatake.";
	}

	@Override
	public String doNinjutsu() {

		return ninjutsu.doNinjutsu();
		
	}
}