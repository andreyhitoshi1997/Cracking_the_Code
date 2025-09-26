import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    @DisplayName("Testa se o método main executa sem erros")
    void testMain() {
        // Captura a saída do console
        var originalOut = System.out;
        var outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executa o método main
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });

        // Verifica se alguma saída foi produzida
        var output = outputStream.toString();
        assertFalse(output.isEmpty(), "A aplicação deve produzir alguma saída");
        assertTrue(output.contains("Java 24"), "Deve mencionar Java 24");

        // Restaura a saída original
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Testa operações básicas com recursos modernos do Java")
    void testModernJavaFeatures() {
        // Testando text blocks
        var textBlock = """
                Teste de
                múltiplas linhas
                """;
        assertNotNull(textBlock);
        assertTrue(textBlock.contains("múltiplas"));

        // Testando switch expressions
        var dayMessage = switch (java.time.DayOfWeek.MONDAY) {
            case MONDAY -> "Segunda-feira";
            case FRIDAY -> "Sexta-feira";
            default -> "Outro dia";
        };
        assertEquals("Segunda-feira", dayMessage);
    }

    @Test
    @DisplayName("Testa assertions básicas")
    void testBasicAssertions() {
        // Usando var em testes
        var result = 1 + 1;
        assertEquals(2, result);
        assertTrue(result > 0);

        // Testando com collections modernas
        var list = java.util.List.of(1, 2, 3, 4, 5);
        assertEquals(5, list.size());
        assertTrue(list.contains(3));
    }
}
