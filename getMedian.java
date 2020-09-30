import java.util.Arrays;
import java.io.*;

public class getMedian {
	
	// Median Method
	public static void median() throws IOException {
		
		// Arrays.sort all set arrays
		Arrays.sort(teamAvg.points);
		Arrays.sort(teamAvg.assists);
		Arrays.sort(teamAvg.rebounds);
		
		
		if (teamAvg.points.length % 2 == 1) {
			
			double median = (double)(teamAvg.points[teamAvg.points.length / 2]);
			
			System.out.println("Median POINTS: "+median);
		}
		
		else {
			
			double median = (double)((teamAvg.points[teamAvg.points.length/2] + teamAvg.points[(teamAvg.points.length/2)-1]) / 2);
			
			System.out.println("Median POINTS: " +median);
		}
		
		if (teamAvg.assists.length % 2 == 1) {
			
			double median = (double)(teamAvg.assists[teamAvg.assists.length / 2]);
			
			System.out.println("Median ASSISTS: "+median);
		}
		
		else {
			
			double median = (double)((teamAvg.assists[teamAvg.assists.length/2] + teamAvg.assists[(teamAvg.assists.length/2)-1]) / 2);
			
			System.out.println("Median ASSISTS: " +median);
			
		}
		
		if (teamAvg.rebounds.length % 2 == 1) {
			
			double median = (double)(teamAvg.rebounds[teamAvg.rebounds.length / 2]);
			
			System.out.println("Median REBOUNDS: "+median);
		}
		
		else {
			
			double median = (double)((teamAvg.rebounds[teamAvg.rebounds.length/2] + teamAvg.rebounds[(teamAvg.rebounds.length/2)-1]) / 2);
			
			System.out.println("Median REBOUNDS: " +median);
			
		}

		
	}
}
