import java.util.Scanner;

public class Atividade47 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 9 números inteiros na matriz para saber a diagonal principaç");
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Digite os números");
                matriz[i][j] = leia.nextInt();
            }
        }
        System.out.println("A diagonal principal é:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (i == j){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}