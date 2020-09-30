import java.util.Scanner;
import java.io.*;

public class teamAvg {
	
	public static int [] points = new int[culm.rows];
	public static int [] assists = new int[culm.rows];
	public static int [] rebounds = new int[culm.rows];
	
	// Get Average Method
	public static void getAvg() throws IOException{
		
		
		@SuppressWarnings("resource")
		Scanner fileScan = new Scanner(culm.file);
		
		fileScan.nextLine();
		

		for (int index = 0; index < culm.rows; index++) {
			
			fileScan.next();
			
			points[index] = fileScan.nextInt();
			
			assists[index] = fileScan.nextInt();
			
			rebounds[index] = fileScan.nextInt();
		}
		
		int pointSum = 0;
		int assistSum = 0;
		int reboundSum = 0;
		
		
		for (int count = 0; count < points.length; count++) {
			pointSum = pointSum + points[count];
		}
		for (int count = 0; count < assists.length; count++) {
			assistSum = assistSum + assists[count];
		}
		for (int count = 0; count < rebounds.length; count++) {
			reboundSum = reboundSum + rebounds[count];
		}
		
		double pointsAVG = (double)pointSum / (double)points.length;
		double assistsAVG = (double)assistSum / (double)assists.length;
		double reboundsAVG = (double)reboundSum / (double)rebounds.length;
		
		System.out.println("TEAM POINTS AVG: "+pointsAVG);
		System.out.println("TEAM ASSISTS AVG: "+assistsAVG);
		System.out.println("TEAM REBOUNDS AVG: "+reboundsAVG);

		
		
	}

}
