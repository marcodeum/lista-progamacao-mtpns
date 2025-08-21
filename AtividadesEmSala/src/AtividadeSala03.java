public class AtividadeSala03 {
    public static void main (String[] args){
        int a = 15;
        int b = 20;
        int resultado = 0;
        resultado = a+b;
        System.out.println("Soma: " +resultado);
        resultado = a-b;
        System.out.println("Subtração: "+resultado);
        resultado = a*b;
        System.out.println("Multiplicação: "+resultado);
        resultado = a/b;
        System.out.println("Divisão: "+resultado);
        System.out.println("----------------------------");
        System.out.println("a == b ? "+(a == b));
        System.out.println("a != b ? "+(a!=b));
        System.out.println("a >= b ? "+(a>=b));
        System.out.println("a <= b ? "+(a<=b));
    }
}