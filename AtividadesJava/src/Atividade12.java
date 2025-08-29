import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga o valor de x:");
        int x = leia.nextInt();
        System.out.println("Diga o valor de y:");
        int y = leia.nextInt();
        int quociente = x / y;
        int resto = x % y;
        System.out.println("O quociente de x e y é: "+quociente);
        System.out.println("O resto de x e y é: "+resto);
    }
}