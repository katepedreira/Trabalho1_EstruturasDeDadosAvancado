// Utilize o vetor de tamanho dinâmico criado anteriormente. Gere 1000 números aleatórios e armazene neste vetor.

import java.util.ArrayList;
import java.util.Random;

public class Exercicio_5 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        Random random = new Random();

        for(int x = 0; x<1000; x++){
            int i = random.nextInt(1000);
            vetor.add(i);
        }
        System.out.println(vetor);

    }

}
