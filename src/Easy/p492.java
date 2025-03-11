package Easy;

import java.util.Scanner;

public class p492 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int fi = sc.nextInt();
		
		while (num1 != 0 && num2 != 0 && fi != 0) {
			if (num1 == num2)
				System.out.println(fi / num1);
			else {
				int nMajor = Math.max(num1, num2);
				int nMenor = Math.min(num1, num2);
				int mcd = 0;
			    int a = nMajor;
			    int b = nMenor;
			    
			    while(b != 0) {
			    	mcd = b;
			    	b = a % b;
			    	a = mcd;
			    }
			    long mcm = (nMajor * ((long) nMenor / mcd));
			    System.out.println(fi / mcm);
			}

						
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			fi = sc.nextInt();
		}
		sc.close();
	}
}
