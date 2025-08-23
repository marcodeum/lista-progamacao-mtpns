import java.util.Scanner;
public class AtividadeSala12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[3];
        double media = 0, soma =0;
        for(int i = 0; i < notas.length; i++){
            notas[i] = 0;
            System.out.println("Digite a "+(i+1)+"ª nota");
            notas[i] = leia.nextDouble();
            soma += notas[i];
            if(i==2) media = soma/notas.length;
        }
        System.out.println("A média das notas é: "+media);
    }
}