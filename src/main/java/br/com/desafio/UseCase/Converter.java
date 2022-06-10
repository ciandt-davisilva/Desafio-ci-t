package br.com.desafio.UseCase;

import br.com.desafio.modelo.ClienteRequest;
import br.com.desafio.modelo.ClienteResponse;

public interface Converter {
    public ClienteResponse retornaResponse(ClienteRequest clienteRequest);


}
