import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int maior = 0;
        boolean primeiroNumero = true;

        while (true) {
            System.out.print("Digite um número inteiro (-1 para encerrar): ");
            numero = leia.nextInt();

            if (numero == -1) {
                break;
            }

            if (primeiroNumero) {
                maior = numero;
                primeiroNumero = false;
            } else if (numero > maior) {
                maior = numero;
            }
        }

        if (primeiroNumero) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("O maior número digitado foi: " + maior);
        }
    }
}