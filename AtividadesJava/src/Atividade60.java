import java.util.Scanner;

public class Atividade60 {
    public static void Triangulo(int a, int b, int c) {
        boolean testeA = a < (b+c);
        boolean testeB = a < (a+c);
        boolean testeC = a < (b+a);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] val = new int[3];
        for (int i = 0; i < val.length; i++){
            System.out.println("Digite o valor "+(i+1)+"º valor");
            val[i] = leia.nextInt();
        }
        Triangulo(val[0],val[1],val[2]);
    }

    public static class Atvidade54 {
    }
}