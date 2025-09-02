import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada do 1 ao 10");
        int num = leia.nextInt();
        for (int i = 0; i < 11; i++){
            System.out.println(i*num);
        }
    }
}
