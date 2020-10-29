package spring_1_demoProject.coachingApp;

public class TrackCoach implements AllCoach {

	private PlayerDietPlan theDietPlan;
	
	public TrackCoach() {
		
	}
	public TrackCoach(PlayerDietPlan dietPlan) {
		theDietPlan=dietPlan;
	}
	@Override
	public String getDailyWorkout() {

		return "Daily run for 3k with 30 minutes break in between.";
	}

	@Override
	public String getDietPlan() {
		
		return theDietPlan.getDiet();
	}
	
	public void doStartup()
	{
		System.out.println("Initilizing the bean startup");
	}
	
	public void doShutdown()
	{
		System.out.println("Destroying the bean.");
	}

}
