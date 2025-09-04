import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Digite 5 números para armazenar");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1)+"º número");
            num[i] = leia.nextInt();
        }
        for (int i = 0; i < num.length; i++){
            System.out.println("Número armazenado:"+num[i]);
        }
    }
}