package Easy;

import java.util.Scanner;
import java.util.ArrayList;

public class p252 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		
		while (!line.equals("XXX")) {
			line = line.replace(" ", "").toLowerCase();
			boolean palindromo = true;
			ArrayList<Character> cua = new ArrayList<Character>();
			
			for (int i = 0; i < line.length() / 2; i++) {
				cua.add(line.charAt(i));
			}
			for (int i = 0; i < line.length() / 2; i++) {
				if (!cua.get(i).equals(line.charAt(line.length() - i - 1))) {
					palindromo = false;
					break;
				}
			}
			
			if (palindromo)
				System.out.println("SI");
			else
				System.out.println("NO");
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
