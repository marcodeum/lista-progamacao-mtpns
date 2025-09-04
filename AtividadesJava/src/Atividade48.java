import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] m = new int[4][4];
        int maior = m[0][0];
        String lol = "";
        System.out.println("Digite números para a matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = leia.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > maior) {
                    lol = "Posição do maior número: "+" linha "+i+ " coluna "+j+"\n"+maior;
                }
            }
        }
        System.out.println(lol);
    }
}