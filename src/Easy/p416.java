package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class p416 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String entrada = sc.next();
		
		while (!entrada.equals("0")) {
			int persones = Integer.parseInt(entrada);
			HashSet<String> aniversaris = new HashSet<String>();
			boolean repetits = false;
			for (int i = 0; i < persones; i++) {
				String data = sc.next();
				String diaMes = data.substring(0, data.length() - 5);
				if (!aniversaris.add(diaMes))
					repetits = true;
			}
			if (repetits)
				System.out.println("SI");
			else
				System.out.println("NO");
			
			entrada = sc.next();
		}
		sc.close();
	}
}
