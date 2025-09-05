import java.util.Scanner;

public class Atividade56 {
    public static void imprimeVetorInt(int[]vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Vetor[ "+i+" ]"+vetor[i]);
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite o valor:");
            num[i] = leia.nextInt();
        }
        imprimeVetorInt(num);
    }
}
