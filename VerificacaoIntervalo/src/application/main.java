package application;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um número inteiro de 0 a 100: ");
		valor = sc.nextDouble();
		
		if (valor <= 25 && valor >= 0) {
			System.out.println("Intervalo [0,25]");	
		} else if (valor <= 50 && valor >= 26) {
			System.out.println("Intervalo (25, 50]");
		} else if (valor <= 75 && valor >= 51) {
			System.out.println("Intervalo (50, 75]");
		} else if (valor <= 100 && valor >= 76) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora de Intervalo");
		}
		
		sc.close();
		
	}

}
