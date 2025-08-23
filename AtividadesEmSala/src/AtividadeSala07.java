import java.util.Scanner;

public class AtividadeSala07 {
    public static void main(String[] args) {

        /*
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Todos os valores são negativos");
        } else if (a > 0 || b > 0 || x > 0 || y > 0){
            System.out.println("Pelo menos um valor é negativo");
        } else {
            System.out.println("Todos os valores são positivos");
        }
        char opcao = 'S';
        switch (opcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
                System.out.println("A opção 'N' foi escolhida");
                break;
            default:
                System.out.println("A opção escolhida é invalida");
                break;

         */
        String nome = "";
        int idade = 0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("Seu nome é "+nome);
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else if (idade < 18) {
            System.out.println("Você é menor de idade");
            System.out.println("Qual o seu sexo? m ou f");
        }
            char op = leia.next().charAt(0);
            System.out.println("Você é do sexo: ");
            switch (op){
                case 'm':
                    System.out.println("Masculino");
                    break;
                case 'f':
                    System.out.println("Femenino");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
        }

        }



        }