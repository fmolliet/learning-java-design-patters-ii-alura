package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        // TODO Auto-generated method stub
        System.out.println("Pedido foi gerado: " + pedido.toString());
    }
    
}
