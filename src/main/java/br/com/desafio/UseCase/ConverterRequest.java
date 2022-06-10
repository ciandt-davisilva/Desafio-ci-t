package br.com.desafio.UseCase;

import br.com.desafio.modelo.Cliente;
import br.com.desafio.modelo.ClienteRequest;
import br.com.desafio.modelo.ClienteResponse;

public class ConverterRequest implements Converter {

    @Override
    public ClienteResponse retornaResponse(ClienteRequest clienteRequest) {
        {
            Cliente cliente = Cliente.builder()
                    .nome(clienteRequest.getNome())
                    .tipoDocumento(clienteRequest.getTipoDocumento())
                    .documento(clienteRequest.getDocumento())
                    .tipoPessoaEnum(clienteRequest.getTipoPessoa())
                    .build();

            //Classederepositorio.metodoDoBancoDeDados(cliete)

            ClienteResponse clienteResponse = new ClienteResponse(clienteRequest);
            System.out.println(clienteResponse);
            return clienteResponse;


        }


    }


}