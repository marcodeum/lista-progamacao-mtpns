import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        System.out.println("Dê o valor da base:");
        double base = leia.nextDouble();
        System.out.println("Dê o valor da altura:");
        double altura = leia.nextDouble();
        double perimetro = 2 * (altura+base);
        System.out.println("O perímetro é: "+perimetro);
    }
}
