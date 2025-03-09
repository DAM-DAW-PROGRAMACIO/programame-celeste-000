package Easy;

import java.util.Scanner;

public class p154 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String lletresPossibles = "BCDFGHJKLMNPQRSTVWXYZ";
		
		while (!line.equals("9999 ZZZ")) {
			String dades[] = line.split(" ");
			char car1 = dades[1].charAt(0);
			char car2 = dades[1].charAt(1);
			char car3 = dades[1].charAt(2);
			int num = Integer.parseInt(dades[0]);
			num++;
			
			if (num != 10000) {
				System.out.println(num + " " + car1 + car2 + car3);
			}
			else {
				num = 0;
				int index1 = lletresPossibles.indexOf(car1);
				int index2 = lletresPossibles.indexOf(car2);
				int index3 = lletresPossibles.indexOf(car3);
				
				if (index3 + 1 < lletresPossibles.length()) {
					car3 = lletresPossibles.charAt(index3 + 1);
					System.out.println(String.format("%04d", num) + " " + car1 + car2 + car3);
				}
				else {
					car3 = lletresPossibles.charAt(0);
					if (index2 + 1 < lletresPossibles.length()) {
						car2 = lletresPossibles.charAt(index2 + 1);
						System.out.println(String.format("%04d", num) + " " + car1 + car2 + car3);
					}
					else {
						car2 = lletresPossibles.charAt(0);
						car3 = lletresPossibles.charAt(index1 + 3);
						System.out.println(String.format("%04d", num) + " " + car1 + car2 + car3);
					}
				}
			}
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
