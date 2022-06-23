package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

/**
 * RegistroDeOrcamento
 */
public class RegistroDeOrcamento {
    
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar( Orcamento orcamento ){
        
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
            "valor",orcamento.getValor(),
            "quantidadeItens", orcamento.getQuantidadeItens()
        );
        // chamada http para API Externa
        // URL Connection
        // HTTP client do apache
        // Lib Rest
        http.post(url, dados);
    }
}