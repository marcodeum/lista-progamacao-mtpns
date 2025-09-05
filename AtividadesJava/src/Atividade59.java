public class Atividade59 {
    public static void mediaArit(double[]vetor){
        double media = 0, soma = 0;
        int nItens = vetor.length;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
            if (i ==(nItens-1))
                media = soma/nItens;
        }
        System.out.println("A média dos valores é: "+media);
    }

    public static void main(String[] args) {
        double[] valores = {4,5,6,7,8,9,1,3};
        mediaArit(valores);
    }
}