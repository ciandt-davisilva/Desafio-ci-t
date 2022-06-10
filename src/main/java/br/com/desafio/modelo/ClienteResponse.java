package br.com.desafio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

//@Builder
public class ClienteResponse {
    private String agencia;
    private int numeroConta;
    private double saldo;

    public ClienteResponse(ClienteRequest clienteRequest) {
        Conta conta = new Conta();
        this.agencia = conta.getAgencia();
        this.numeroConta = conta.getNumeroConta();
        this.saldo = conta.getSaldo();
    }

    public ClienteResponse convert( ClienteRequest clienteRequest) {
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
//    Conta conta = new Conta();
}
