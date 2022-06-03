package br.com.desafio;

import br.com.desafio.enums.TipoDocumento;
import br.com.desafio.enums.TipoPessoa;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Cliente {
    @ToString.Exclude
    private String nome;
    @ToString.Exclude
    private Enum<TipoPessoa> tipoPessoaEnum;
    @ToString.Exclude
    private Enum<TipoDocumento> doc;
    @ToString.Exclude
    private DadosEndereço dadosendereco;
    @ToString.Exclude
    private DadosContato dadosContato;
    private Conta conta;
    public Cliente(@NonNull String nome, @NonNull Enum<TipoPessoa> tipoPessoaEnum, @NonNull Enum<TipoDocumento> doc
                  /*, @NonNull DadosEndereço dadosendereco, @NonNull DadosContato dadosContato*/) throws InstantiationException, IllegalAccessException {
        this.conta = new Conta();
        this.nome = nome;
        this.tipoPessoaEnum = tipoPessoaEnum;
        this.doc = doc;
        this.dadosendereco = dadosendereco;
        this.dadosContato = dadosContato;
    }
}
