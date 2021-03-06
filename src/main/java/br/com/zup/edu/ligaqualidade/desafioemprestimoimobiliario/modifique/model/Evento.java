package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.TipoAcao;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.TipoEvento;

import java.time.LocalDateTime;
import java.util.UUID;

public class Evento {

    private UUID id;

    private TipoEvento tipoEvento;

    private TipoAcao tipoAcao;

    private LocalDateTime dataEvento;

    public Evento(){}

    public Evento(UUID id, TipoEvento tipoEvento, TipoAcao tipoAcao, LocalDateTime dataEvento) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.tipoAcao = tipoAcao;
        this.dataEvento = dataEvento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public TipoAcao getTipoAcao() {
        return tipoAcao;
    }

    public void setTipoAcao(TipoAcao tipoAcao) {
        this.tipoAcao = tipoAcao;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }
}
