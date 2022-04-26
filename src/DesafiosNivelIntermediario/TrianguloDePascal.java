package DesafiosNivelIntermediario;

/*
	Calcule o triângulo de Pascal até um determinado número de linhas.
	
	No Triângulo de Pascal cada número é calculado somando os números à
	direita e à esquerda da posição atual na linha anterior.
	
	    1
	   1 1
	  1 2 1
	 1 3 3 1
	1 4 6 4 1
	# ... etc
*/

import java.util.Scanner;

public class TrianguloDePascal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe as linhas: ");
		int linhas = scanner.nextInt();
		
		int trianguloPascalPreenchido [][] = new int[linhas][linhas];
		
		trianguloPascalPreenchido = criarTriangulo(linhas);
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < linhas; j++) {
				System.out.print("|" + trianguloPascalPreenchido[i][j] + "|");
			}
			System.out.println();
		}
		
		scanner.close();

	}
	
	static int[][] criarTriangulo(int linhas){
		int trianguloPascal [] [] = new int [linhas][linhas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < linhas; j++) {
				trianguloPascal[i][j] = 0;
			}
		}
		
		trianguloPascal[0][0] = 1;
		trianguloPascal[1][0] = 1;
		trianguloPascal[1][1] = 1;
		
		for (int i = 2; i < linhas; i++) {
			trianguloPascal[i][0] = 1;
			trianguloPascal[i][i] = 1;
			for (int j = 1; j < linhas; j++) {
				trianguloPascal[i][j] = trianguloPascal[i-1][j-1] + trianguloPascal[i-1][j];
			}
		}
		
		return trianguloPascal;
	}

}
