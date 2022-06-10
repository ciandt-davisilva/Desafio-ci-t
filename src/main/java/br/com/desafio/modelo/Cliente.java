package br.com.desafio.modelo;

import br.com.desafio.enums.TipoDocumento;
import br.com.desafio.enums.TipoPessoa;
import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
//@Entity //mapear entidade
//@Table(name = "Clientes") //nomear atributo da tabela diferente do nome da classe
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ToString.Exclude
    private String nome;
    @ToString.Exclude
    private TipoPessoa tipoPessoaEnum;
    @ToString.Exclude
    private TipoDocumento tipoDocumento;

    private String documento;
    @ToString.Exclude
    private DadosEndereço dadosendereco;
    @ToString.Exclude
    private DadosContato dadosContato;
    private Conta conta;


    public Cliente(@NonNull String nome, @NonNull Enum<TipoPessoa> tipoPessoaEnum, @NonNull Enum<TipoDocumento> doc,@NonNull String documento
            /*, @NonNull DadosEndereço dadosendereco, @NonNull DadosContato dadosContato*/) throws InstantiationException, IllegalAccessException {
//        this.conta =new Conta(); // deveria criar aqui e não no response(?)
        this.nome = nome;
        this.tipoPessoaEnum = (TipoPessoa) tipoPessoaEnum;
        this.tipoDocumento = (TipoDocumento) doc;
        this.documento = documento;
        this.dadosendereco = dadosendereco;
        this.dadosContato = dadosContato;
    }
}
