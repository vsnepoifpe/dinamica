package main;

import java.util.Scanner;

//Calculadora basica com as 4 operações
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("===== Calculadora =====");
			System.out.println("1. Adicao");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opcao: ");
			int opcao = scanner.nextInt();

			if (opcao >= 1 && opcao <= 4) {
				System.out.print("Digite o primeiro numero: ");
				double num1 = scanner.nextDouble();

				System.out.print("Digite o segundo numero: ");
				double num2 = scanner.nextDouble();
				double resultado = 0;

				switch (opcao) {
				case 1:
					// Implementar lógica de soma aqui
					break;
				case 2:
					resultado = num1 - num2;
					break;
				case 3:
					resultado = num1 * num2;
					break;
				case 4:
					// Implementar lógica de divisão aqui
					break;
				}
				
				System.out.println("Resultado: " + resultado);
			} else if (opcao == 5) {
				running = false;
				System.out.println("Saindo...");
			} else {
				System.out.println("Opcao invalida! Tente novamente.");
			}

			System.out.println();
		}

		scanner.close();
	}
}
