import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga uma letra de A a D");
        String letra = leia.nextLine();
        switch (letra){
            case "A":
                System.out.println("A de Amor");
                break;
            case "B":
                System.out.println("B de Benção");
                break;
            case "C":
                System.out.println("C de Cristo");
                break;
            case "D":
                System.out.println("D de Deus");
                break;
        }
    }
}