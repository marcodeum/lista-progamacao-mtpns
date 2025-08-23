public class AtividadeSala02 {
    public static void main (String[] args){
        String nome = "Marco Túlio ";
        String sobrenome = "Paiva Nunes de Souza";
        int idade = 16;
        double peso = 64.1;
        double altura = 1.75;
        double imc = peso / (altura*altura);
        int anoNasc = 2025 - idade;
        System.out.println("Nome: " +nome +sobrenome);
        String texto = "Peso: " +peso + "; Altura: " +altura;
                System.out.println("Ano de nascimento: " +anoNasc );
        System.out.println(texto);
        System.out.println("IMC: " +imc);
    }
}