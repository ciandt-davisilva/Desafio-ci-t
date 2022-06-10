package br.com.desafio.controller;

import br.com.desafio.modelo.Cliente;
import br.com.desafio.modelo.ClienteRequest;
import br.com.desafio.modelo.ClienteResponse;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@ToString
@RestController
public class ClientesController {
    @RequestMapping("/clientes")
    @ResponseBody
    public ClienteResponse clienteResponse( @RequestBody  ClienteRequest clienteRequest) {
        ClienteRequest cc = new ClienteRequest();
        return new ClienteResponse(clienteRequest).convert(cc);

    }

}

