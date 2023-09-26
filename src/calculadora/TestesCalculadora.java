package calculadora;

import org.junit.Test;

public class TestesCalculadora {

    @Test
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        
        // Testes SOMA
        System.out.println("TESTES SOMA");
        int testeSoma1 = soma.somar(10, 10);
        System.out.println("TESTE 1 - SOMA: " + testeSoma1);
        
        int testeSoma2 = soma.somar(0, 0);
        System.out.println("TESTE 2 - SOMA: " + testeSoma2);
        
        int testeSoma3 = soma.somar(-1, -1);
        System.out.println("TESTE 3 - SOMA: " + testeSoma3);
        
        
        
        //Testes SUBTRACAO
        System.out.println("\nTESTES SUBTRACAO");
        int testeSub1 = subtracao.subtrair(15, 10);
        System.out.println("TESTE 1 - SUBTRACAO: " + testeSub1);
        
        int testeSub2 = subtracao.subtrair(0, 0);
        System.out.println("TESTE 2 - SUBTRACAO: " + testeSub2);
        
        int testeSub3 = subtracao.subtrair(-1, -3);
        System.out.println("TESTE 3 - SUBTRACAO: " + testeSub3);
        
        
        
        //Testes MULTIPLICACAO
        System.out.println("\nTESTES MULTIPLICACAO");
        int testeMult1 = multiplicacao.multiplicar(15, 10);
        System.out.println("TESTE 1 - MULTIPLICACAO: " +  testeMult1);
        
        int  testeMult2 = multiplicacao.multiplicar(12, 0);
        System.out.println("TESTE 2 - MULTIPLICACAO: " +  testeMult2);
        
        int  testeMult3 = multiplicacao.multiplicar(-5, -3);
        System.out.println("TESTE 3 - MULTIPLICACAO: " +  testeMult3);
        
        
        
        //Testes DIVISAO
        System.out.println("\nTESTES MULTIPLICACAO");
        int testeDiv1 = divisao.dividir(15, 10);
        System.out.println("TESTE 1 - DIVISAO: " +  testeDiv1);
        
        int  testeDiv2 = divisao.dividir(-5, -3);
        System.out.println("TESTE 3 - DIVISAO: " +  testeDiv2);
        
        int  testeDiv3 = divisao.dividir(12, 0);
        System.out.println("TESTE 2 - DIVISAO: " +  testeDiv3);
    }
    
}
