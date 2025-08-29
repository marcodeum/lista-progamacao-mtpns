import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idadeAnos = leia.nextInt();
        int idadeMeses = idadeAnos*12;
        System.out.println("Sua idade em meses é:" +idadeMeses);
    }
}