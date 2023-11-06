package calculadora;

import org.junit.Test;

public class Divisao {
    // Classe utilizada para dividir dois valores

    // Método de divisão
    // Recebe dois valores inteiros como entrada e retorna o resultado da divisão de 'a' por 'b'.
    // Lança uma exceção ArithmeticException se 'b' for igual a 0, pois a divisão por zero não é possível.
    @Test
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possivel realizar divisão por 0");
        }
        return a / b;
    }
}
