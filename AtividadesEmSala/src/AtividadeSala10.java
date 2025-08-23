import java.util.Scanner;
public class AtividadeSala10 {
    public static void main(String[] args) {
        int x = 5, contador = 0;

        while(contador <= 10){
           System.out.println(x + "*" + contador + " = " + (x * contador));
          contador++;

        }
        Scanner leia = new Scanner(System.in);
        contador = 0;
        System.out.println("Escolha um número para fazer a sua tabuada");
        int numero = leia.nextInt();
        System.out.println("A tabuada do número " +numero+ " é:");
        while(contador <= 10){
            System.out.println(numero + "*" + contador + " = " + (numero*contador));
            contador++;
        }
        }
    }