package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Item;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item(geraPedido.getValorOrcamento()));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
	
}
