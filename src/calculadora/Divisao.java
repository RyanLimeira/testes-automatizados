package calculadora;

import org.junit.Test;

public class Divisao {
    // Classe utilizada para dividir dois valores
    @Test
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possivel realizar divisão por 0");
        }
        return a / b;
    }
}
