package main;

import java.util.Scanner;


public class Main {
    private static final double PI = 3.141592653589793;
    private static boolean modoGraus = true; // Verdadeiro para graus, falso para radianos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Calculadora =====");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Elevado a potência de (x^y)");
            System.out.println("6. Raiz quadrada (√x)");
            System.out.println("7. Inverso de um número (1/x)");
            System.out.println("8. Arco seno (asin x)");
            System.out.println("9. Módulo de um número (|x|)");
            System.out.println("10. Indicar número negativo");
            System.out.println("11. Seno de um ângulo");
            System.out.println("12. Tangente (tan x)");
            System.out.println("13. Logaritmo de base 10 (log10 x)");
            System.out.println("14. Cosseno de um ângulo");
            System.out.println("15. Avaliar expressão.");
            System.out.println("16. Calcular a área de um círculo usando π");
            System.out.println("17. Arco cosseno (acos x)");
            System.out.println("18. Logaritmo Natural (ln x)");
            System.out.println("19. Alternar entre Graus e Radianos");
            System.out.println("20. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    // Adição
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    // Subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    // Multiplicação
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    // Divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
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
                    // Indicar número negativo
                    System.out.print("Digite o número: ");
                    num = scanner.nextDouble();
                    resultado = num * -1;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 11:
                    // Seno de um ângulo
                    System.out.print("Digite o valor do ângulo: ");
                    double angulo = scanner.nextDouble();
                    if (modoGraus) {
                        angulo = Math.toRadians(angulo);
                    }
                    resultado = Math.sin(angulo);
                    System.out.println("Resultado: seno = " + resultado);
                    break;
                case 12:
                    // Tangente (tan x)
                    System.out.print("Digite o valor do ângulo: ");
                    angulo = scanner.nextDouble();
                    if (modoGraus) {
                        angulo = Math.toRadians(angulo);
                    }
                    resultado = Math.tan(angulo);
                    System.out.println("Resultado: tan = " + resultado);
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
                    break;
                case 14:
                    // Cosseno de um ângulo
                    System.out.print("Digite o valor do ângulo: ");
                    angulo = scanner.nextDouble();
                    if (modoGraus) {
                        angulo = Math.toRadians(angulo);
                    }
                    resultado = Math.cos(angulo);
                    System.out.println("Resultado: cos = " + resultado);
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
                case 16:
                    // Calcular a área de um círculo usando π
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    resultado = PI * Math.pow(raio, 2);
                    System.out.println("Área do círculo com raio " + raio + " = " + resultado);
                    break;
                case 17:
                    // Arco cosseno (acos x)
                    System.out.print("Digite o valor do cosseno (entre -1 e 1): ");
                    num = scanner.nextDouble();
                    if (num >= -1 && num <= 1) {
                        resultado = Math.acos(num);
                        double resultadoGraus = Math.toDegrees(resultado);
                        System.out.println("Resultado: arccos(" + num + ") = " + resultado + " radianos ou " + resultadoGraus + " graus");
                    } else {
                        System.out.println("Erro: O valor deve estar entre -1 e 1.");
                    }
                    break;
                case 18:
                    // Logaritmo Natural (ln x)
                    System.out.print("Digite um número positivo: ");
                    num = scanner.nextDouble();
                    if (num > 0) {
                        resultado = Math.log(num);
                        System.out.println("Resultado: ln(" + num + ") = " + resultado);
                    } else {
                        System.out.println("Erro: O número deve ser maior que zero.");
                    }
                    break;
                case 19:
                    // Alternar entre Graus e Radianos
                    System.out.println("Você está atualmente em " + (modoGraus ? "Graus" : "Radianos"));
                    System.out.println("Escolha a conversão:");
                    System.out.println("1. Converter de Graus para Radianos");
                    System.out.println("2. Converter de Radianos para Graus");
                    System.out.print("Escolha uma opção: ");
                    int escolhaConversao = scanner.nextInt();
                    switch (escolhaConversao) {
                        case 1:
                            modoGraus = false;
                            System.out.println("Modo alterado para Radianos.");
                            break;
                        case 2:
                            modoGraus = true;
                            System.out.println("Modo alterado para Graus.");
                            break;
                        default:
                            System.out.println("Escolha inválida.");
                            break;
                    }

                    if (modoGraus) {
                        System.out.print("Digite o valor em radianos para converter para graus: ");
                        double radianos = scanner.nextDouble();
                        resultado = Math.toDegrees(radianos);
                        System.out.println("Resultado: " + radianos + " radianos = " + resultado + " graus");
                    } else {
                        System.out.print("Digite o valor em graus para converter para radianos: ");
                        double graus = scanner.nextDouble();
                        resultado = Math.toRadians(graus);
                        System.out.println("Resultado: " + graus + " graus = " + resultado + " radianos");
                    }
                    break;
                case 20:
                    // Sair
                    System.out.println("Saindo...");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static double avaliarExpressao(String expressao) throws Exception {
        javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = manager.getEngineByName("JavaScript");
        return (Double) engine.eval(expressao);
    }
}
