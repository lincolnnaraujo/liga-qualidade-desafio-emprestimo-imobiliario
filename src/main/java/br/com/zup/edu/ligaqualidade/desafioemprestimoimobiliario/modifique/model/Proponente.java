package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Proponente {

    private UUID id;

    private UUID idProposta;

    private String nome;

    private Integer idade;

    private boolean isPrincipal;

    private List<Garantia> listaGarantia;

    private BigDecimal renda;

    public Proponente(){}

    public Proponente(UUID id, UUID idProposta, String nome, Integer idade, boolean isPrincipal, List<Garantia> listaGarantia, BigDecimal renda) {
        this.id = id;
        this.idProposta = idProposta;
        this.nome = nome;
        this.idade = idade;
        this.isPrincipal = isPrincipal;
        this.listaGarantia = listaGarantia;
        this.renda = renda;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public boolean isPrincipal() {
        return isPrincipal;
    }

    public void setPrincipal(boolean principal) {
        isPrincipal = principal;
    }

    public List<Garantia> getListaGarantia() {
        return listaGarantia;
    }

    public void setListaGarantia(List<Garantia> listaGarantia) {
        this.listaGarantia = listaGarantia;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }
}
