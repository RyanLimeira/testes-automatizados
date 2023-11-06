# Calculadora em Java

Calculadora básica e objetiva utilizando as principais operações, sendo elas SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO e DIVISÃO.

## Objetivos

Utilização testes automatizados aprendidos em aula.

## Classes
### Soma
```
public class Soma {
    // Classe utilizada para somar dois valores

    // Método de soma
    // Recebe dois valores inteiros como entrada e retorna a soma deles.
    @Test
    public int somar(int a, int b) {
        return a + b;
    }
}
```

### Subtracao
```
public class Subtracao {
    // Classe utilizada para subtrair dois valores

    // Método de subtração
    // Recebe dois valores inteiros como entrada e retorna a diferença entre eles.
    @Test
    public int subtrair(int a, int b) {
        return a - b;
    }
}
```

### Multiplicacao
```
public class Multiplicacao {
    // Classe utilizada para multiplicar dois valores

    // Método de multiplicação
    // Recebe dois valores inteiros como entrada e retorna o resultado da multiplicação de 'a' por 'b'.
    @Test
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
```

### Divisao
```
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

```
### Classe para Testes
```
/**
 * Calculadora - Um conjunto de classes para operações matemáticas básicas.
 * @author - Ryan Limeira
 * @since -  05/11/2023
 * @version - 1.1
 */

// Classe de testes para operações matemáticas da calculadora
public class TestesCalculadora {

    @Test
    public static void main(String[] args) {
        
        // Cria as instâncias das operações matemáticas
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        
        // Testes SOMA
        System.out.println("TESTES SOMA");
        
        // Teste 1 - Soma de 10 + 10
        int testeSoma1 = soma.somar(10, 10); // Realiza a soma
        System.out.println("TESTE 1 - SOMA: " + testeSoma1); // Exibe o resultado
        
        // Teste 2 - Soma de 0 + 0
        int testeSoma2 = soma.somar(0, 0); // Realiza a soma
        System.out.println("TESTE 2 - SOMA: " + testeSoma2); // Exibe o resultado
        
        // Teste 3 - Soma de -1 + -1
        int testeSoma3 = soma.somar(-1, -1); // Realiza a soma
        System.out.println("TESTE 3 - SOMA: " + testeSoma3); // Exibe o resultado
        
        
        //Testes SUBTRACAO
        System.out.println("\nTESTES SUBTRACAO");
        
        // Teste 1 - Subtração de 15 - 10
        int testeSub1 = subtracao.subtrair(15, 10); // Realiza a subtração
        System.out.println("TESTE 1 - SUBTRACAO: " + testeSub1); // Exibe o resultado
        
        // Teste 2 - Subtração de 0 - 0
        int testeSub2 = subtracao.subtrair(0, 0); // Realiza a subtração
        System.out.println("TESTE 2 - SUBTRACAO: " + testeSub2); // Exibe o resultado
        
        // Teste 3 - Subtração de -1 - -3
        int testeSub3 = subtracao.subtrair(-1, -3); // Realiza a subtração
        System.out.println("TESTE 3 - SUBTRACAO: " + testeSub3); // Exibe o resultado
        
        
        //Testes MULTIPLICACAO
        System.out.println("\nTESTES MULTIPLICACAO");
        
        // Teste 1 - Multiplicação de 15 * 10
        int testeMult1 = multiplicacao.multiplicar(15, 10); // Realiza a multiplicação
        System.out.println("TESTE 1 - MULTIPLICACAO: " +  testeMult1); // Exibe o resultado
        
        // Teste 2 - Multiplicação de 12 * 0
        int  testeMult2 = multiplicacao.multiplicar(12, 0); // Realiza a multiplicação
        System.out.println("TESTE 2 - MULTIPLICACAO: " +  testeMult2); // Exibe o resultado
        
        // Teste 3 - Multiplicação de -5 * -3
        int  testeMult3 = multiplicacao.multiplicar(-5, -3); // Realiza a multiplicação
        System.out.println("TESTE 3 - MULTIPLICACAO: " +  testeMult3); // Exibe o resultado
        
        
        
        //Testes DIVISAO
        System.out.println("\nTESTES MULTIPLICACAO");
        
        // Teste 1 - Divisão de 15 / 10
        int testeDiv1 = divisao.dividir(15, 10); // Realiza a divisão
        System.out.println("TESTE 1 - DIVISAO: " +  testeDiv1); // Exibe o resultado
        
        // Teste 2 - Divisão de -5 / -3
        int  testeDiv2 = divisao.dividir(-5, -3); // Realiza a divisão
        System.out.println("TESTE 3 - DIVISAO: " +  testeDiv2); // Exibe o resultado
        
        // Teste 3 - Divisão de 12 / 0
        int  testeDiv3 = divisao.dividir(12, 0); // Realiza a divisão
        System.out.println("TESTE 2 - DIVISAO: " +  testeDiv3); // Exibe o resultado
    }
```

## Considerações Finais
Atualização repositório calculadora com a devida documentação do código.
