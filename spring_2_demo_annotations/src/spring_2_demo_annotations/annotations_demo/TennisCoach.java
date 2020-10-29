package spring_2_demo_annotations.annotations_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private RecreationService recreationService;
	
	 @Autowired 
	  public TennisCoach(RecreationService theRecreation){
	  
		  recreationService=theRecreation;
	  
	  }
	 
	public TennisCoach() {
		
	}
	 
	@Override
	public String getPractice() {
		
		return "Do 100 hits with ball machine.";
	}

	@Override
	public String recreation() {
		
		return recreationService.recreation();
	}
}