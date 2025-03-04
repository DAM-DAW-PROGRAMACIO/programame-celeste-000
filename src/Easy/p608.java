package Easy;

import java.util.Scanner;

public class p608 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mesures = sc.nextInt();
		
		while (mesures != 0) {
			int senyals = 0;
			boolean avis = false;
			for (int i = 0; i < mesures; i++) {
				int cas = sc.nextInt();
				if (cas <= 4) {
					if (!avis) {
						senyals++;
						avis = true;
					}
				}
				else if (cas > 6) {
					avis = false;
				}
			}
			System.out.println(senyals);
			
			mesures = sc.nextInt();
		}
		sc.close();
	}
}
