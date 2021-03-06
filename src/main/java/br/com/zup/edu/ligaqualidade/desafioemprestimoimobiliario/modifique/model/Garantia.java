package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Garantia {

    private UUID id;

    private UUID idProposta;

    private String descricao;

    private BigDecimal valor;

    public Garantia(){}

    public Garantia(UUID id, UUID idProposta, String descricao, BigDecimal valor) {
        this.id = id;
        this.idProposta = idProposta;
        this.descricao = descricao;
        this.valor = valor;
    }

    public UUID getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(UUID idProposta) {
        this.idProposta = idProposta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
