package DistanceApp;
public class DistanceApp {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.printf("%.2f\n",journeyCalculator.calculateDistance(60.0, 1.5));
	}
	
}
