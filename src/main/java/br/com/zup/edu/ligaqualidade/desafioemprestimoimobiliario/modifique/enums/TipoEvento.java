package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums;

public enum TipoEvento {
    PROPOSAL("proposal"),
    WARRANTY("warranty"),
    PROPONENT("proponent");

    private final String descricao;

    TipoEvento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
