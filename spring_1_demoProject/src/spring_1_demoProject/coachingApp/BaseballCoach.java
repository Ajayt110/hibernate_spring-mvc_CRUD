package spring_1_demoProject.coachingApp;

public class BaseballCoach implements AllCoach {
	
	private PlayerDietPlan thePlan;
	
	public BaseballCoach() {

	}
	
	public BaseballCoach(PlayerDietPlan theDietPlan ) {
		 thePlan =theDietPlan ;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Daily 1hr batting 1hr catching";
	}

	@Override
	public String getDietPlan() {
		
		return thePlan.getDiet();
	}

}
