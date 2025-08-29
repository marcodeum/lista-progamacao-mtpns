import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de celsius:");
        double celsius = leia.nextDouble();
        double fahrenheint = (9 * celsius) / 5 + 32;
        System.out.println("O valor celsius em fahrenheint é: "+fahrenheint);
    }
}
