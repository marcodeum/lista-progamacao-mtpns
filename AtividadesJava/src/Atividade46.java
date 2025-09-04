import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] num = new int[2][2];
        int soma = 0;
        System.out.println("Digite os números para serem armazenados");
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                num[i][j] = leia.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                soma += num[i][j];
            }
        }
        System.out.println(soma);
    }
}
