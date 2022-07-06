package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Item;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionaItem(new Item(new BigDecimal("200")));
        antigo.reprovar();
        
        Orcamento novo = new Orcamento();
        novo.adicionaItem(new Item(new BigDecimal("500")));
        novo.adicionaItem(antigo);
        
        System.out.println(novo.getValor());
    }
}
