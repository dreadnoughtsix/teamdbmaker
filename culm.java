import java.util.Scanner;
import java.io.*;


public class culm {
	
	// Global Array (resource)
	public static int[][] array;
	
	// Global Index (resource)
	public static int index;
	
	// Global File Name (resource)
	public static File file;
	
	// Global Columns (resource)
	public static int columns;
	
	// Global Rows (resource)
	public static int rows; 
	
	// Global Input String (resource)
	public static String userInput;
	
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	throws IOException{

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		userInput = "/y";
		
		System.out.println("PROJECT CNSX-13");
		System.out.println("BETA");
		System.out.println("Version 1.7.3");
		System.out.println();
		
		do {

			System.out.println("Enter Team File Name");
			String fileName = scan.next();
			scan.nextLine();
			
			file = new File(fileName);
			
			if (file.exists()) {
				System.out.println("File found. Update or Scan? (/update or /scan)");
				String userIn = scan.nextLine();
				
				if (userIn.equals("/update")) {
					createTeam.newTeam();
					teamAvg.getAvg();
					getMedian.median();
				}
				
				else if (userIn.equals("/scan")) {
					teamAvg.getAvg();
					getMedian.median();
				}
				
				else {
					System.out.println("COMMAND NOT FOUND");
					continue;
				}
				
			}
			
			else {
				
				System.out.println("File Not Found. Make new file? (/y or /n)");
				String userIn = scan.next();
				
				if (userIn.equals("/y")) {
					
					createTeam.newTeam();
					teamAvg.getAvg();
					getMedian.median();
				}
				
				else {
					System.out.println("Are you sure you want to exit?");
					System.out.println("Any unsaved data will be deleted.");
					System.out.println();
					System.out.println("Exit? (/y or /n)");
					String userExit = scan.next();
					
					if (userExit.equals("/y")) {
						break;
					}
					else {
						continue;
					}
					
				}
			}
			
			System.out.println();
			System.out.println("Continue? (/y or /n)");
			culm.userInput = scan.next();
			
		} while (userInput.equals("/y"));
		
		System.out.println("Program terminated.");
		

		
		
	}
}
