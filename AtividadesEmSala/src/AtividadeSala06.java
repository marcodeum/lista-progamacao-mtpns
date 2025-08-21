public class AtividadeSala06 {
    public static void main(String[] args) {
        int a = 5, b = -5, x = 30, y = 9;
        boolean teste, verdadeiro = true, falso = false;
        teste = (a > b) || (a < b);
        System.out.println("(a > b) || (a < b): " +teste);
        teste = (x > a) && (y > a);
        System.out.println("(x > a) && (y > a): "+teste);
        teste = !verdadeiro;
        System.out.println("!verdadeiro: "+teste);

        teste = verdadeiro || falso;
        System.out.println("verdadeiro || falso: "+teste);
        teste = !(falso || falso) && verdadeiro;
        System.out.println("!(falso || falso) && verdadeiro: "+teste);
        teste = verdadeiro || falso && verdadeiro;
        System.out.println("verdadeiro || falso && verdadeiro: "+teste);
        teste = verdadeiro && !(falso && falso);
        System.out.println("verdadeiro && !(falso && falso): "+teste);
    }
}