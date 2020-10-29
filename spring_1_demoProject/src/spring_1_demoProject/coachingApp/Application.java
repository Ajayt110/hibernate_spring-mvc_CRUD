package spring_1_demoProject.coachingApp;

public class Application {

	public static void main(String[] args) {

		AllCoach coach = new TrackCoach();
		
		System.out.println(coach.getDailyWorkout());
	}

}
