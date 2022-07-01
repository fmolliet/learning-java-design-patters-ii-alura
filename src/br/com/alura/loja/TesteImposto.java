package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(1000), 10);
        
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
