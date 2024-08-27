package main;
import java.util.Scanner;

//Calculadora básica com as 4 operações e operações científicas
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
         System.out.println("5. Elevado a potencia de (x^y)");
         System.out.println("6. Raiz quadrada (√x)");
         System.out.println("7. Inverso de um número (1/x)");
         System.out.println("8. Arco seno (asin x)");
         System.out.println("9. Módulo de um número (|x|)");
         System.out.println("10. Sair");
         System.out.print("Escolha uma opcao: ");
         int opcao = scanner.nextInt();

         double resultado = 0;

         switch (opcao) {
             case 1:
                 System.out.print("Digite o primeiro numero: ");
                 double num1 = scanner.nextDouble();
                 System.out.print("Digite o segundo numero: ");
                 double num2 = scanner.nextDouble();
                 resultado = num1 + num2;
                 System.out.println("Resultado: " + resultado);
                 break;
             case 2:
                 System.out.print("Digite o primeiro numero: ");
                 num1 = scanner.nextDouble();
                 System.out.print("Digite o segundo numero: ");
                 num2 = scanner.nextDouble();
                 resultado = num1 - num2;
                 System.out.println("Resultado: " + resultado);
                 break;
             case 3:
                 System.out.print("Digite o primeiro numero: ");
                 num1 = scanner.nextDouble();
                 System.out.print("Digite o segundo numero: ");
                 num2 = scanner.nextDouble();
                 resultado = num1 * num2;
                 System.out.println("Resultado: " + resultado);
                 break;
             case 4:
                 System.out.print("Digite o primeiro numero: ");
                 num1 = scanner.nextDouble();
                 System.out.print("Digite o segundo numero: ");
                 num2 = scanner.nextDouble();
                 resultado = num1 / num2;
                 System.out.println("Resultado: " + resultado);
                 break;
             case 5:
                 // Elevado à potência de (x^y)
                 System.out.print("Digite a base (x): ");
                 double base = scanner.nextDouble();
                 System.out.print("Digite o expoente (y): ");
                 double expoente = scanner.nextDouble();
                 resultado = Math.pow(base, expoente);
                 System.out.println("Resultado: " + base + "^" + expoente + " = " + resultado);
                 break;
             case 6:
                 // Raiz quadrada (√x)
                 System.out.print("Digite o número: ");
                 double num = scanner.nextDouble();
                 resultado = Math.sqrt(num);
                 System.out.println("Resultado: √" + num + " = " + resultado);
                 break;
             case 7:
                 // Inverso de um número (1/x)
                 System.out.print("Digite o número: ");
                 num = scanner.nextDouble();
                 if (num != 0) {
                     resultado = 1 / num;
                     System.out.println("Resultado: 1/" + num + " = " + resultado);
                 } else {
                     System.out.println("Erro: Divisão por zero não é permitida.");
                 }
                 break;
             case 8:
                 // Arco seno (asin x)
                 System.out.print("Digite o número (-1 a 1): ");
                 num = scanner.nextDouble();
                 if (num >= -1 && num <= 1) {
                     resultado = Math.asin(num);
                     System.out.println("Resultado: arcsin(" + num + ") = " + resultado + " radianos");
                 } else {
                     System.out.println("Erro: O valor deve estar entre -1 e 1.");
                 }
                 break;
              case 9:
                    // Módulo de um número (|x|)
                    System.out.print("Digite o número: ");
                    num = scanner.nextDouble();
                    resultado = Math.abs(num);
                    System.out.println("Resultado: |" + num + "| = " + resultado);
                    break;
                 
             //SAIDA
             case 10:
                 running = false;
                 System.out.println("Saindo...");
                 break;
             default:
                 System.out.println("Opcao invalida! Tente novamente.");
         }

         System.out.println();
     }

     scanner.close();
 }
}
