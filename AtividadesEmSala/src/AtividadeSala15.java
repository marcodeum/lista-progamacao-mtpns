import java.util.Scanner;

public class AtividadeSala15 {
    public static double soma(double x, double y) {
        return x + y;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        return x / y;
    }

    public static void printResultado(char op, double x, double y, double resultado) {
        System.out.printf(x + "" + op + y + " = " + resultado);
    }

    public static double potencia(double x, int expoente) {
        double resultado = x;
        for (int n = 0; n < (expoente - 1); n++) {
            resultado = resultado * x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String historico = "";
        int opcao = -1;
        do {

            System.out.println("Escolha uma das opções abaixo");
            System.out.println(
                    "1 - Soma\n" +
                            "2 - Subtração\n" +
                            "3 - Multiplicação\n" +
                            "4 - Divisão\n" +
                            "5 - Potenciação\n" +
                            "0 - Sair\n");
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Digite os números para a soma (x + y)");
                    System.out.println("Digite o valor de x: ");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('+', x, y, soma(x, y));
                    historico += x + " + " + y + " = " + soma(x, y) + "\n";
                    break;
                case 2:
                    System.out.println("Digite os números para a subtração (x - y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('-', x, y, subtracao(x, y));
                    historico += x + " - " + y + " = " + subtracao(x, y) + "\n";
                    break;
                case 3:
                    System.out.println("Digite os números para a multiplicação (x * y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('*', x, y, multiplicacao(x, y));
                    historico += x + " * " + y + " = " + multiplicacao(x, y) + "\n";
                    break;
                case 4:
                    System.out.println("Digite os números para a divisão (x / y)");
                    System.out.println("Digite o valor de x:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor de y:");
                    y = leia.nextDouble();
                    printResultado('*', x, y, divisao(x, y));
                    historico += x + " / " + y + " = " + divisao(x, y) + "\n";
                    break;
                case 5:
                    System.out.println("Digite os números para a potenciação: (base e expoente)");
                    System.out.println("Digite o valor da base:");
                    x = leia.nextDouble();
                    System.out.println("Digite o valor do expoente:");
                    int e = leia.nextInt();
                    printResultado('^', x, e, potencia(x, e));
                    historico += x + " ^ " + e + " = " + potencia(x, e) + "\n";
                    break;
                case 0:
                    System.out.println("Você escolheu sair\n" +
                            "Segue a lista de todas as operações realizadas:");
                    System.out.println(historico);
                    break;
                default:
                    System.out.println("Opção não encontrada");
                    break;
            }
        } while (opcao != 0);
    }
}