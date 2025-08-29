import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
        boolean temCNH = false;
        String cnh = "";
        Scanner leia = new Scanner(System.in);
        System.out.println("Diga sua idade");
        int idade = leia.nextInt();
        if (idade < 18) {
            System.out.println("Você não pode dirigir");
        } else {
            System.out.println("Você tem CNH? true or false");
            temCNH = leia.nextBoolean();{
                if (temCNH = true){
                    System.out.println("Você pode dirigir");
                }else {
                    System.out.println("Você não pode dirigir");
                }
            }
             }
        }
    }