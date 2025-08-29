import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga sua idade:");
        int idade = leia.nextInt();
        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }
    }
}
