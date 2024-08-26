package main;

import java.util.Scanner;

// Calculadora básica com as 4 operações e operações científicas
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
            System.out.println("5. Elevado à potência de (x^y)");
            System.out.println("6. Raiz quadrada (√x)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            double resultado = 0;

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro numero: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo numero: ");
                double num2 = scanner.nextDouble();

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
                        resultado = num1 / num2;
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcao == 5) {
                // Elevado à potência de (x^y)
                System.out.print("Digite a base (x): ");
                double base = scanner.nextDouble();

                System.out.print("Digite o expoente (y): ");
                double expoente = scanner.nextDouble();

                resultado = Math.pow(base, expoente);
                System.out.println("Resultado: " + base + "^" + expoente + " = " + resultado);

            } else if (opcao == 6) {
                // Raiz quadrada (√x)
                System.out.print("Digite o número: ");
                double num = scanner.nextDouble();

                resultado = Math.sqrt(num);
                System.out.println("Resultado: √" + num + " = " + resultado);

            } else if (opcao == 7) {
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
