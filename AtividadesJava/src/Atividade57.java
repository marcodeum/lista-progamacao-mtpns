import java.util.Scanner;

public class Atividade57 {
    public static void parImpar(int x){
        if (x % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para saber se é par ou ímpar");
        int x = leia.nextInt();
        parImpar(x);
    }
}
