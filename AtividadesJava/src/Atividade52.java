import java.util.Scanner;

public class Atividade52 {
    public static double CelsiusFahrenheit(double x){
        return x * 1.8 + 32;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor em celsius para saber em fahrenheit");
        double x = leia.nextDouble();
        System.out.println(x+" em fahrenheit é: "+CelsiusFahrenheit(x));
    }
}