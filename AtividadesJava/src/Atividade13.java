import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga o valor de a:");
        int a = leia.nextInt();
        System.out.println("Diga o valor de b:");
        int b = leia.nextInt();
        System.out.println("Diga o valor de c:");
        int c = leia.nextInt();
        System.out.println("Diga o valor de d:");
        int d = leia.nextInt();
        int r = (a+b) * c-d;
        System.out.println("O resultado é: "+r);
    }
}
