package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p458 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int line = sc.nextInt();
		
		while (line != 0) {
			long numeros[] = new long[line];
			for (int i = 0; i < line; i++) {
				numeros[i] = sc.nextLong();
			}
			Arrays.sort(numeros);
			if (numeros[0] * numeros[1] > numeros[numeros.length - 1] * numeros[numeros.length - 2]) {
				System.out.println(numeros[0] * numeros[1]);
			}
			else {
				System.out.println(numeros[numeros.length - 1] * numeros[numeros.length - 2]);
			}
			
			line = sc.nextInt();
		}
		sc.close();
	}
}
