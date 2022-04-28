package DesafiosNivelBascio;

import java.util.Scanner;

/*
	Dado um inteiro x, retorne truese xfor um inteiro palíndromo.
	Um inteiro é um palíndromo quando lê o mesmo para trás e para frente.
	Por exemplo, 121é um palíndromo enquanto 123não é.
*/

public class NumeroPalindromo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = scanner.nextInt();

		boolean resultadoVerificaPalindromo = verificaNumeroPalindromo(numero);

		System.out.println(numero + " é palindromo? " + resultadoVerificaPalindromo);

		scanner.close();
	}

	static boolean verificaNumeroPalindromo(int numero) {
		String numeroStr = Integer.toString(numero);
		String numeroStrReverse = "";
		char ch;

		for (int i = numeroStr.length() - 1; i >= 0; i--) {
			ch = numeroStr.charAt(i);
			numeroStrReverse = numeroStrReverse + ch;
		}

		if (numeroStr.equals(numeroStrReverse)) {
			return true;
		} else {
			return false;
		}
	}

}
