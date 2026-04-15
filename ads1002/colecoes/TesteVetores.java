public class TesteVetores {
    // Definindo arrays em java
    public static void main(String[] args) {
        int[] vetor1 = new int[5];
        int[] vetor2 = {42, 17, 8, 55, 23, 1};
        // for comum
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }

        // enhanced for (for each) (java 5+)
        for (int i : vetor2) {
            System.out.println(i);
        }
        // System.out.println(vetor1[2]);
        // vetor1[0] = 42;
        // vetor1[1] = 17;
        // vetor1[2] = 8;
        // vetor1[3] = 55;
        // vetor1[4] = 23;
    }
}