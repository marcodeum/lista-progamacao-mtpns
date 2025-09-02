import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner leia  = new Scanner(System.in);
        int idade = 0, contador = -1, soma = 0;
        double media = 0;
        do {
            System.out.println("Digite idades");
            idade = leia.nextInt();
            contador++;
            soma += idade;
        }while (idade > -1);
        media = soma/contador;
        System.out.println("A média das idades é: "+media);
    }
}