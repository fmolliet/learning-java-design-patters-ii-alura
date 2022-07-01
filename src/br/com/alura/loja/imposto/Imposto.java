package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto outro;

	public Imposto( Imposto outro ){
		this.outro = outro;
	}
	
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento){
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if ( outro != null ){
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}
		
		return valorImposto.add(valorDoOutroImposto);
	}

}
