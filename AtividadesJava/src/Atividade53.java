import java.util.Scanner;

public class Atividade53 {
    public static boolean primo(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é primo ou não");
        int x = leia.nextInt();
        if (primo(x)){
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }
    }
}