import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        System.out.println("Dê o valor para a: ");
        int a = leia.nextInt();
        System.out.println("Dê o valor para b: ");
        int b = leia.nextInt();
     int soma = a + b;
        System.out.println("a + b = "+soma);
    }
    }