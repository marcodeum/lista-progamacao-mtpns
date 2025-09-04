public class Atividade45 {
    public static void main(String[] args) {
        int [] primVet = {1,2,3,4,5};
        int[] segVet = {5,4,3,2,1};
        int[] vetSoma = new int[5];
        for (int i = 0; i > vetSoma.length; i++){
            vetSoma[i] = primVet[i] + segVet[i];
            System.out.println("Vetor som["+i+"] " + "= " +vetSoma[i]);
        }
    }
}
