package Easy;

import java.util.Scanner;

public class plantillaScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		
		while (!line.equals("0")) {
			
			System.out.println("");
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
