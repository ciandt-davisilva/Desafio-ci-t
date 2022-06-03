package br.com.desafio;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Getter
public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo;
    @ToString.Exclude
    ArrayList<Integer> numerosDasContas = new ArrayList<>();

    public Conta() throws InstantiationException, IllegalAccessException {

        numeroConta = verificaNumero();
        this.agencia = 99;
        this.saldo = 0.0;
    }

    public int verificaNumero() throws InstantiationException, IllegalAccessException {
        int aleartorio = (int) (Math.random() * 6000) + 1000;

        if (!(numerosDasContas.contains(aleartorio))) {
            numerosDasContas.add((aleartorio));
            return aleartorio;
        } else {
            return verificaNumero();

        }
    }

}
