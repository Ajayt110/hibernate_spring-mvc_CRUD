package spring_2_demo_annotations.annotations_demo;

import org.springframework.stereotype.Component;

@Component
public class RecreationPlanner implements RecreationService{

	@Override
	public String recreation() {
		
		return "You can watch Netflix and chill.";
	}

}
