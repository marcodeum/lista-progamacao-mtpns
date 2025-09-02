import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = leia.nextInt();

        if (numero < 0) {
            System.out.println("Sem fatorial para números negativos1");
        } else {
            int fatorial = 1;
            int contador = numero;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}