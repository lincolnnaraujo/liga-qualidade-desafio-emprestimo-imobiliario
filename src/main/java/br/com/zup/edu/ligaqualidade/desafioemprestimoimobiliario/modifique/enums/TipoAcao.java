package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums;

public enum TipoAcao {
    CREATED("created"),
    ADDED("added");

    private final String descricao;

    TipoAcao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
