import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] num = new int[8];
        System.out.println("Digite 8 números inteiros");
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite o "+(i+1)+"º número");
            num[i] = leia.nextInt();
        }
        int k = num[0];
        int j = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] > k){
                k = num[i];
            }
        }
        for (int i = 0; i < num.length; i++){
            if (num[i] < j){
                j = num[i];
            }
        }
        System.out.println("O maior número digitado foi: "+k+"\n O menor número digitado foi: "+j);
    }
}