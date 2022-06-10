package br.com.desafio.modelo;

import br.com.desafio.enums.TipoDocumento;
import br.com.desafio.enums.TipoPessoa;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest extends Object{
    private String nome;
    private TipoPessoa tipoPessoa;
    private TipoDocumento tipoDocumento;
    private String documento;


}
