import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, contador = 0, soma = 0;
        do {
            System.out.println("Digite números");
            num = leia.nextInt();
            soma+= num;
        }while (num != 0);
        System.out.println("A soma dos números é: "+soma);
    }
}