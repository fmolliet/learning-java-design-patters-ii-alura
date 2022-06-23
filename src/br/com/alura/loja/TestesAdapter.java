package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.HttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        
        orcamento.aprovar();
        orcamento.finalizar();
        
        RegistroDeOrcamento registro = new RegistroDeOrcamento(new HttpClient());
        registro.registrar(orcamento);
    }
}
