import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Digite 10 números inteiros");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "º número");
            num[i] = leia.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0){
                System.out.println("Números pares: "+num[i]);
            }
        }
    }
}