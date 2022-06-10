package br.com.desafio.modelo;

import lombok.*;

import java.util.ArrayList;

@ToString
@AllArgsConstructor
@Builder
@Getter
public class Conta {
    private String agencia;
    private int numeroConta;
    private double saldo;
@ToString.Exclude
    private ArrayList<Integer> numerosDasContas = new ArrayList<>();


    public Conta() {
        numeroConta = verificaNumero();
        this.agencia = "99";
        this.saldo = 0.0;
    }

    public int verificaNumero()  {
        int aleartorio = (int) (Math.random() * 6000) + 1000;

        if (!(numerosDasContas.contains(aleartorio))) {
            numerosDasContas.add((aleartorio));
            return aleartorio;
        } else {
            return verificaNumero();

        }
    }
}
