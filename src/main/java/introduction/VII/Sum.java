package introduction.VII;

public class Sum {
    public static int sum(int n) {
        if(n<=0) {
            return 0;
        }
        return n + sum(n-1);
    }
    public static int pairSumSequence(int n ){
        int sum=0;
        for (int i=0; i<n; i++) {
            sum += pairSum(i,i+1);
        }
        return sum;
    }

    static int pairSum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("=== ANÁLISE DE COMPLEXIDADE DE TEMPO ===\n");

        analyzeSum();
        analyzePairSum();
        analyzePairSumSequence();
    }

    public static void analyzeSum() {
        System.out.println("1. MÉTODO sum(int n) - RECURSIVO");
        System.out.println("   Complexidade: O(n)");
        System.out.println("   Explicação: Faz uma chamada recursiva para cada valor de n até 0");

        long startTime = System.nanoTime();
        int result = sum(5);
        long endTime = System.nanoTime();

        System.out.println("   Exemplo: sum(5) = " + result);
        System.out.println("   Tempo execução: " + (endTime - startTime) + " nanosegundos");
        System.out.println("   Chamadas recursivas: 6 (n=5,4,3,2,1,0)\n");
    }

    public static void analyzePairSum() {
        System.out.println("2. MÉTODO pairSum(int a, int b)");
        System.out.println("   Complexidade: O(1)");
        System.out.println("   Explicação: Operação simples de soma, tempo constante");

        long startTime = System.nanoTime();
        int result = pairSum(10, 20);
        long endTime = System.nanoTime();

        System.out.println("   Exemplo: pairSum(10, 20) = " + result);
        System.out.println("   Tempo execução: " + (endTime - startTime) + " nanosegundos\n");
    }

    public static void analyzePairSumSequence() {
        System.out.println("3. MÉTODO pairSumSequence(int n)");
        System.out.println("   Complexidade: O(n)");
        System.out.println("   Explicação: Loop que executa n vezes, cada iteração chama pairSum O(1)");

        long startTime = System.nanoTime();
        int result = pairSumSequence(5);
        long endTime = System.nanoTime();

        System.out.println("   Exemplo: pairSumSequence(5) = " + result);
        System.out.println("   Tempo execução: " + (endTime - startTime) + " nanosegundos");
        System.out.println("   Iterações do loop: " + 5);
        System.out.println("   Cálculo: (0+1) + (1+2) + (2+3) + (3+4) + (4+5) = " + result + "\n");
    }
}
