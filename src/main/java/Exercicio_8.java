// Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}.
// Crie um método que retorna o maior elemento do vetor.

public class Exercicio_8 {

    private int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

    public int[] getVetor() {
        return vetor;
    }

    public int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length - 1; i++) {
            int proximo = vetor[i + 1];
            if (proximo > maior) {
                maior = vetor[i + 1];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Exercicio_8 exercicio = new Exercicio_8();
        int maiorNum = exercicio.maiorValor(exercicio.getVetor());
        System.out.println(maiorNum);
    }
}
