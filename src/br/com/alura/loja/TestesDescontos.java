package br.com.alura.loja;

import java.math.BigDecimal;
import java.net.http.HttpResponse.PushPromiseHandler;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Item;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionaItem(new Item(new BigDecimal("200")));
		Orcamento segundo = new Orcamento();
		segundo.adicionaItem(new Item(new BigDecimal("1000")));
		Orcamento terceiro = new Orcamento();
		terceiro.adicionaItem(new Item(new BigDecimal("500")));

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}
