// Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}.
// Crie um método que retorna o menor elemento do vetor.

public class Exercicio_9 {

    private int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

    public int[] getVetor() {
        return vetor;
    }

    public int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 0; i < vetor.length - 1; i++) {
            int proximo = vetor[i + 1];
            if (proximo < menor) {
                menor = vetor[i + 1];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Exercicio_9 exercicio = new Exercicio_9();
        int menorNum = exercicio.menorValor(exercicio.getVetor());
        System.out.println(menorNum);
    }
}
