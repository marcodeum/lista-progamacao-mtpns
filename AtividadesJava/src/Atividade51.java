import java.util.Scanner;

public class Atividade51 {
    public static int soma(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite dois valores para a soma");
        x = leia.nextInt();
        y = leia.nextInt();
        System.out.println("A soma dos valores é: "+soma(x,y));
    }
}
