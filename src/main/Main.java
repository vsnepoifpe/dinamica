package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            System.out.println("10. Indicar número negativo");
            System.out.println("11. retinar o valor do seno de um argulo");
            System.out.println("12. Tangente (tan x)");
            System.out.println("13. Logaritmo de base 10 (log10 x)");
            System.out.println("14. Cosseno de um angulo");
            System.out.println("15. Avaliar expressão.");


            System.out.println("17. Sair");
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
                case 10:
                    // Módulo de um número (|x|)
                    System.out.print("Digite o número: ");
                    num = scanner.nextDouble();
                    if (num != 0) resultado = num * -1;
                    else resultado = 0;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 11:
                    // Módulo de um número (|x|)
                    System.out.print("Digite o valor em graus: ");
                    num = scanner.nextDouble();
                    num = Math.toRadians(num);
                    resultado = Math.sin(num);
                    num = Math.toDegrees(num);
                    System.out.println("Resultado: o seno de " + num + "  = " + resultado + " graus");
                    break;
                case 12:
                    // Tangente (tan x)
                    System.out.print("Digite o valor do ângulo em graus: ");
                    double angulo = scanner.nextDouble();
                    double anguloRadianos = Math.toRadians(angulo);
                    resultado = Math.tan(anguloRadianos);
                    System.out.println("Resultado: tan(" + angulo + ") = " + resultado);
                    break;
                case 13:
                    // Logaritmo de base 10 (log10 x)
                    System.out.print("Digite um número positivo: ");
                    num = scanner.nextDouble();
                    if (num > 0) {
                        resultado = Math.log10(num);
                        System.out.println("Resultado: log10(" + num + ") = " + resultado);
                    } else {
                        System.out.println("Erro: O número deve ser maior que zero.");
                    }
                case 14:
                    // Cosseno de um ângulo
                    System.out.println("Você deseja inserir o ângulo em:");
                    System.out.println("1. Graus");
                    System.out.println("2. Radianos");
                    System.out.print("Escolha uma opção: ");
                    int escolha = scanner.nextInt();

                    if (escolha == 1) {
                        System.out.print("Digite o valor do ângulo em graus: ");
                        angulo = scanner.nextInt();
                        anguloRadianos = Math.toRadians(angulo);
                    } else if (escolha == 2) {
                        System.out.print("Digite o valor do ângulo em radianos: ");
                        anguloRadianos = scanner.nextInt();
                    } else {
                        System.out.println("Opção inválida!");
                        break;
                    }


                    resultado = Math.cos(anguloRadianos);
                    System.out.println("Resultado: cos(" + anguloRadianos + " radianos) = " + resultado);
                    break;

                case 15:
                    // Avaliar expressão com parênteses
                    scanner.nextLine(); // Consumir o caractere de nova linha pendente
                    System.out.print("Digite a expressão: ");
                    String expressao = scanner.nextLine();
                    try {
                        resultado = avaliarExpressao(expressao);
                        System.out.println("Resultado: " + resultado);
                    } catch (Exception e) {
                        System.out.println("Erro ao avaliar a expressão: " + e.getMessage());
                    }
                    break;


                //SAIDA
                case 17:
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

    // Função para avaliar a expressão matemática
    public static double avaliarExpressao(String expressao) throws Exception {

        expressao = expressao.replaceAll("\\s", "");


        Pattern pattern = Pattern.compile("\\(([^()]+)\\)");
        Matcher matcher = pattern.matcher(expressao);

        while (matcher.find()) {

            String subExpressao = matcher.group(1);
            double resultado = avaliarOperacoes(subExpressao);

            expressao = expressao.replaceFirst(Pattern.quote(matcher.group()), Double.toString(resultado));
            matcher = pattern.matcher(expressao);
        }


        return avaliarOperacoes(expressao);
    }


    public static double avaliarOperacoes(String expressao) throws Exception {
        expressao = avaliarOperacao(expressao, "\\^", (a, b) -> Math.pow(a, b));

        expressao = avaliarOperacao(expressao, "\\*", (a, b) -> a * b);
        expressao = avaliarOperacao(expressao, "/", (a, b) -> a / b);
        expressao = avaliarOperacao(expressao, "\\+", (a, b) -> a + b);
        expressao = avaliarOperacao(expressao, "-", (a, b) -> a - b);


        return Double.parseDouble(expressao);
    }

    // Função para avaliar operações específicas com base em regex
    private static String avaliarOperacao(String expressao, String regex, Operacao operacao) throws Exception {
        Pattern pattern = Pattern.compile("(-?\\d+\\.?\\d*)\\s*(" + regex + ")\\s*(-?\\d+\\.?\\d*)");
        Matcher matcher = pattern.matcher(expressao);

        while (matcher.find()) {
            double num1 = Double.parseDouble(matcher.group(1));
            double num2 = Double.parseDouble(matcher.group(3));
            double resultado = operacao.executar(num1, num2);
            expressao = expressao.replaceFirst(Pattern.quote(matcher.group()), Double.toString(resultado));
            matcher = pattern.matcher(expressao);
        }

        return expressao;
    }

    // Interface funcional para as operações matemáticas
    interface Operacao {
        double executar(double a, double b);
    }
}
