package br.com.desafio.testes;

import br.com.desafio.*;
import br.com.desafio.enums.TipoDocumento;
import br.com.desafio.enums.TipoPessoa;

public class TestesRapidos {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
       Cliente cliente = new Cliente("Davi Costa", TipoPessoa.PJ, TipoDocumento.CPF);
        System.out.println(cliente);
    }
}
