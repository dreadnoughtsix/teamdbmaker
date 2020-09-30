import java.io.*;
import java.util.Scanner;

public class createTeam {
	
	// New Team Method
	public static void newTeam() throws IOException{
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter Team Name");
			String teamName = scan.nextLine();
	
				PrintStream print = new PrintStream(culm.file);
				print.println(teamName);
				
				// Rows / Number of Players
				System.out.println("Enter number of players (MINIMUM: 5)");  
				culm.rows = scan.nextInt(); 
				
				// Columns / Points, Assists, Rebounds
				culm.columns = 3;
				scan.nextLine();
				
				// Arrays
				culm.array = new int[culm.rows][culm.columns];
				String[] names = new String[culm.rows];
				
				// LOOP (resource)
				for (int indexTwo = 0; indexTwo < culm.rows; indexTwo++) {
					
					System.out.println("Enter Player Name (Player-Name):");
					names[indexTwo] = scan.next();
					scan.nextLine();
					print.print(names[indexTwo]+" ");
					
					culm.index = 0;
					
					while (culm.index < culm.array[0].length + 1) { 
					
						System.out.println("Enter Points:");
						culm.array[0][culm.index] = scan.nextInt();
						print.print(culm.array[0][culm.index]+" ");
						culm.index++;
							
							if (culm.index == culm.array[0].length){
								break;
							}
						
						System.out.println("Enter Assists");
						culm.array[0][culm.index] = scan.nextInt();
						print.print(culm.array[0][culm.index]+" ");
						culm.index++;
						
							if (culm.index == culm.array[0].length){
								break;
							}
						
						System.out.println("Enter Rebounds");
						culm.array[0][culm.index] = scan.nextInt();
						print.print(culm.array[0][culm.index]+" ");
						culm.index++;
						
							if (culm.index == culm.array[0].length){
								break;
							}
						
						}
					
					print.println(); // Separator for PrintStream in file
					
					}
					
					print.close();
					
	}
}
