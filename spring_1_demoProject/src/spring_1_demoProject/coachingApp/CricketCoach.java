package spring_1_demoProject.coachingApp;


public class CricketCoach implements AllCoach {

	private PlayerDietPlan dietPlan;
	
	private String coachName;
	private String emailId; 
	
	public String getCoachName() {
		return "The Coach Name is : "+coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getEmailId() {
		return "The Email ID is : "+emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CricketCoach() {

	}
	
	public void setDietPlan(PlayerDietPlan dietPlan) {
		this.dietPlan = dietPlan;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Batting against fastbowler 1hr and spinner 1hr in the nets.";
	}

	@Override
	public String getDietPlan() {
		// TODO Auto-generated method stub
		return dietPlan.getDiet();
	}
	
	

}
