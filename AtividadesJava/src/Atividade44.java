import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] nota = {15, 16, 17, 18, 19};
        int soma = 0;
        System.out.println("Digite a nota dos alunos");
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a "+(i+1)+"ª nota");
            nota[i] = leia.nextInt();
        }
        for (int i = 0; i < nota.length; i++){
            soma += nota[i];
        }
        double media = soma/5;
        System.out.println("A média da nota dos alunos é:");
        System.out.println(media);
    }
}