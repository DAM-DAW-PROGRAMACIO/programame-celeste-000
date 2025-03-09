package Easy;

import java.util.Scanner;
import java.util.Stack;

public class p141 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			Stack<Character> pila = new Stack<Character>();
			//push(); pop(); peek();
			String line = sc.nextLine();
			char caracter;
			boolean balanceado = true;
			
			for (int i = 0; i < line.length(); i++) {
				caracter = line.charAt(i);
				if (caracter == '(' || caracter == '{' || caracter == '[') {
					pila.push(caracter);
					balanceado = false;
				}
				else if (caracter == ')') {
					if (pila.isEmpty() || pila.peek() != '(') {
						balanceado = false;
						break;
					}
					else {
						pila.pop();
						balanceado = true;
					}
				}
				else if (caracter == '}') {
					if (pila.isEmpty() || pila.peek() != '{') {
						balanceado = false;
						break;
					}
					else {
						pila.pop();
						balanceado = true;
					}
				}
				else if (caracter == ']') {
					if (pila.isEmpty() || pila.peek() != '[') {
						balanceado = false;
						break;
					}
					else {
						pila.pop();
						balanceado = true;
					}
				}
			}
			if (balanceado)
				System.out.println("YES");
			else
				System.out.println("NO");
				
		}
		sc.close();
	}
}
