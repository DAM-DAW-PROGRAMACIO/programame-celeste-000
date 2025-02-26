package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p245 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("0")) {
			int nPersones = Integer.parseInt(line);
			line = br.readLine();
			String entrada[] = line.split(" ");
			long altures[] = new long[entrada.length];
			for (int i = 0; i < entrada.length; i++) {
				altures[i] = Integer.parseInt(entrada[i]);
			}
			boolean creixent = true;
			for (int i = 0; i < nPersones - 1; i++) {
				if (nPersones >= 2) {
					if (altures[i] >= altures[i + 1]) {
						creixent = false;
					}
				}
			}
			boolean decreixent = true;
			for (int i = 0; i < nPersones - 1; i++) {
				if (nPersones >= 2) {
					if (altures[i] <= altures[i + 1]) {
						decreixent = false;
					}
				}
			}
			if (creixent || decreixent)
				System.out.println("DALTON");
			else
				System.out.println("DESCONOCIDOS");

			line = br.readLine();
		}
	}
}
