import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga o valor da nota 1");
        double n1 = leia.nextDouble();
        System.out.println("Diga o valor da nota 2");
        double n2 = leia.nextDouble();
        if (n1 >= 6 && n2 >= 6) {
            System.out.println("Aprovado");

        } else if (n1 >= 4 || n2 >= 4) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}