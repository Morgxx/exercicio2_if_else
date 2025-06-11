import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 02
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O número " + numero + " é PAR.");
		}
		else {
			System.out.println("O número " + numero + " é IMPAR.");
		}
		
		sc.close();
	}
	

}
