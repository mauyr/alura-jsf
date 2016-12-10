package br.com.caelum.financas.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_CONTAS", sequenceName = "SEQ_CONTAS", initialValue = 1)
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CONTAS")
    private Integer id;
    private String titular;
    private String banco;
    private String agencia;
    private String numero;

    @OneToMany(mappedBy="conta")
    private List<Movimentacao> movimentacoes;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getTitular() {
	return titular;
    }

    public void setTitular(String titular) {
	this.titular = titular;
    }

    public String getBanco() {
	return banco;
    }

    public void setBanco(String banco) {
	this.banco = banco;
    }

    public String getAgencia() {
	return agencia;
    }

    public void setAgencia(String agencia) {
	this.agencia = agencia;
    }

    public String getNumero() {
	return numero;
    }

    public void setNumero(String numero) {
	this.numero = numero;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
}