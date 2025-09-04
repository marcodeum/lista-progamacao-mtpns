import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[][] aoQuad = new int[3][3];
        System.out.println("Digite os números da matriz");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                m[i][j] = leia.nextInt();
            }
        }
        System.out.println("Os números das matrizes ao quadrado são:");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                m[i][j] *= m[i][j];
                aoQuad[i][j] = m[i][j];
                System.out.println(aoQuad[i][j]);
            }
        }
    }
}