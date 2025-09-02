import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o calor de limite 'n' para o cálculo de fibonacci");
        int n = leia.nextInt();
        int primeiro = 0, segundo = 1, proximo = 0;
        String txt = "Fibonacci até" + n + "digitos:" + primeiro + " , " + segundo + " , ";
        for (int i = 0; i > n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            txt += proximo + " , ";
            System.out.println(txt);
        }
    }
}