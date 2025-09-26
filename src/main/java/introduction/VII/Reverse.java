package introduction.VII;

import java.util.Arrays;

public class Reverse {

    void reverse(int[] array){
        for (int i=0; i< array.length/2; i++){
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TESTE DO ALGORITMO REVERSE ===\n");

        Reverse reverser = new Reverse();

        // Teste 1: Array pequeno com debug detalhado
        System.out.println("TESTE 1 - Array pequeno com DEBUG:");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(array1));
        reverser.reverseWithDebug(array1);
        // Chamada da análise de complexidade
        analyzeTimeComplexity();
    }

    // Método reverse com debug detalhado
    void reverseWithDebug(int[] array) {
        System.out.println("  >>> Iniciando reversão com debug <<<");
        System.out.println("  Tamanho do array: " + array.length);
        System.out.println("  Número de iterações: " + array.length/2);

        for (int i = 0; i < array.length/2; i++) {
            int other = array.length - i - 1;

            System.out.println("  Iteração " + (i+1) + ":");
            System.out.println("    i=" + i + ", other=" + other);
            System.out.println("    Trocando array[" + i + "]=" + array[i] +
                             " com array[" + other + "]=" + array[other]);

            // Fazendo a troca
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;

            System.out.println("    Array após troca: " + Arrays.toString(array));
        }
        System.out.println("  >>> Reversão concluída <<<\n");
    }

    public static void analyzeTimeComplexity() {
        System.out.println("=== ANÁLISE DE COMPLEXIDADE DE TEMPO ===");
        System.out.println("MÉTODO reverse(int[] array):");
        System.out.println("• Complexidade: O(n/2) = O(n)");
        System.out.println("• Explicação: O loop executa n/2 vezes, onde n é o tamanho do array");
        System.out.println("• Cada iteração faz operações de tempo constante O(1)");
        System.out.println("• Complexidade de espaço: O(1) - apenas variáveis temporárias");
        System.out.println("• É um algoritmo in-place: modifica o array original sem usar espaço extra");
        System.out.println("• Melhor caso = Pior caso = Caso médio = O(n)");
    }
}
