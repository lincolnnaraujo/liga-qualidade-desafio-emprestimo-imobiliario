package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class PropostaEmprestimo {

    private UUID id;

    private List<Proponente> listaProponentes;

    private BigDecimal valorTotal;

    private BigDecimal valorParcela;

    private Integer quantidadeParcela;

    private LocalDateTime dataCriacao;

    public PropostaEmprestimo(){}

    public PropostaEmprestimo(UUID id, List<Proponente> listaProponentes, BigDecimal valorTotal, BigDecimal valorParcela, Integer quantidadeParcela, LocalDateTime dataCriacao) {
        this.id = id;
        this.listaProponentes = listaProponentes;
        this.valorTotal = valorTotal;
        this.valorParcela = valorParcela;
        this.quantidadeParcela = quantidadeParcela;
        this.dataCriacao = dataCriacao;
    }

    public PropostaEmprestimo(UUID id, BigDecimal valorParcela, Integer quantidadeParcela) {
        this.id = id;
        this.valorParcela = valorParcela;
        this.quantidadeParcela = quantidadeParcela;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Proponente> getListaProponentes() {
        return listaProponentes;
    }

    public void setListaProponentes(List<Proponente> listaProponentes) {
        this.listaProponentes = listaProponentes;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Integer getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(Integer quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
