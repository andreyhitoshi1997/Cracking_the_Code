package introduction.VII;

public class factorail {
    int factorial(int n) {
        if (n<0) {
            return -1;
        } else if (n==0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    // Método factorial com debug detalhado
    int factorialWithDebug(int n, int depth) {
        // Indentação para mostrar a profundidade da recursão
        String indent = "  ".repeat(depth);
        System.out.println(indent + "factorialWithDebug(" + n + ") chamado - Profundidade: " + depth);

        if (n<0) {
            System.out.println(indent + "n < 0, retornando -1");
            return -1;
        } else if (n==0) {
            System.out.println(indent + "n == 0, retornando 1 (caso base)");
            return 1;
        } else {
            System.out.println(indent + "n > 0, calculando " + n + " * factorial(" + (n-1) + ")");
            int result = n * factorialWithDebug(n-1, depth + 1);
            System.out.println(indent + "factorial(" + n + ") = " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TESTE DA FUNÇÃO FACTORIAL ===\n");

        factorail fact = new factorail();

        // Teste 1: Casos básicos
        System.out.println("TESTE 1 - Casos básicos:");
        testBasicCases(fact);

        // Teste 2: Factorial com debug detalhado
        System.out.println("\nTESTE 2 - Factorial com DEBUG (n=5):");
        long startTime = System.nanoTime();
        int result = fact.factorialWithDebug(5, 0);
        long endTime = System.nanoTime();

        System.out.println("Resultado final: " + result);
        System.out.println("Tempo de execução: " + (endTime - startTime) + " nanosegundos");

        // Teste 3: Performance com números maiores
        System.out.println("\nTESTE 3 - Performance com números maiores:");
        testPerformance(fact);

        // Análise de complexidade
        analyzeTimeComplexity();
    }

    public static void testBasicCases(factorail fact) {
        // Testando casos especiais
        System.out.println("factorial(-1) = " + fact.factorial(-1) + " (caso inválido)");
        System.out.println("factorial(0) = " + fact.factorial(0) + " (caso base)");
        System.out.println("factorial(1) = " + fact.factorial(1));
        System.out.println("factorial(3) = " + fact.factorial(3));
        System.out.println("factorial(4) = " + fact.factorial(4));
        System.out.println("factorial(5) = " + fact.factorial(5));
    }

    public static void testPerformance(factorail fact) {
        int[] testValues = {6, 7, 8, 10};

        for (int n : testValues) {
            long startTime = System.nanoTime();
            int result = fact.factorial(n);
            long endTime = System.nanoTime();

            System.out.println("factorial(" + n + ") = " + result +
                             " | Tempo: " + (endTime - startTime) + " ns | Chamadas recursivas: " + (n + 1));
        }
    }

    public static void analyzeTimeComplexity() {
        System.out.println("\n=== ANÁLISE DE COMPLEXIDADE DE TEMPO ===");
        System.out.println("MÉTODO factorial(int n) - RECURSIVO:");
        System.out.println("• Complexidade de Tempo: O(n)");
        System.out.println("• Explicação: Faz uma chamada recursiva para cada valor de n até 0");
        System.out.println("• Número de chamadas: n + 1 (incluindo o caso base n=0)");
        System.out.println("• Complexidade de Espaço: O(n) - devido à pilha de recursão");
        System.out.println("• Cada chamada recursiva usa espaço na pilha");
        System.out.println("• Melhor caso = Pior caso = Caso médio = O(n)");
        System.out.println("• Limitação: Para valores grandes de n, pode causar stack overflow");

        System.out.println("\nCOMPARAÇÃO COM VERSÃO ITERATIVA:");
        System.out.println("• Versão recursiva: O(n) tempo, O(n) espaço");
        System.out.println("• Versão iterativa: O(n) tempo, O(1) espaço");
        System.out.println("• A versão iterativa seria mais eficiente em termos de memória");
    }
}
