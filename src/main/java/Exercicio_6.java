//Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcula a soma dos elementos.

public class Exercicio_6 {

    private int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public int[] getVetor() {
        return vetor;
    }

    public int somaVetor(int[] vetor) {
        int soma = 0;
        for(int indice = 0; indice<vetor.length; indice++){
            soma += (vetor[indice]);
        }
        return soma;
    }

    public static void main(String[] args) {
        Exercicio_6 exercicio = new Exercicio_6();
        int soma = exercicio.somaVetor(exercicio.getVetor());
        System.out.println(soma);
    }

}


