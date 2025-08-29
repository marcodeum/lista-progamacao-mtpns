import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor da nota1");
        int nota1 = leia.nextInt();
        System.out.println("Digite o valor da nota2:");
        int nota2 = leia.nextInt();
        System.out.println("Digite o valor da nota3");
        int nota3 = leia.nextInt();
        System.out.println("A média das notas é: "+(nota1+nota2+nota3)/3);
    }
}
