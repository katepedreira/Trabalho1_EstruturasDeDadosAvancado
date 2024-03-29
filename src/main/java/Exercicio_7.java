// Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcule a média dos elementos.

public class Exercicio_7 {

    private int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public int[] getVetor() {
        return vetor;
    }

    public int mediaVetor(int[] vetor) {
        int soma = 0;
        for(int indice = 0; indice<vetor.length; indice++){
            soma += (vetor[indice]);
        }
        return soma/vetor.length;
    }

    public static void main(String[] args) {
        Exercicio_7 exercicio = new Exercicio_7();
        int media = exercicio.mediaVetor(exercicio.getVetor());
        System.out.println(media);
    }
}
