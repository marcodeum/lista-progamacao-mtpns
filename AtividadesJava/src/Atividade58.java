public class Atividade58 {
    public static void imprimeMatriz(int[][]m){
        if (m.length == m[0].length){
            for (int linha = 0; linha < m.length; linha++){
                String l = "";
                for (int coluna = 0; coluna < m.length; coluna++){
                    l += "["+m[linha][coluna]+"]";
                }
                System.out.println(linha);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        imprimeMatriz(matriz);
    }
}