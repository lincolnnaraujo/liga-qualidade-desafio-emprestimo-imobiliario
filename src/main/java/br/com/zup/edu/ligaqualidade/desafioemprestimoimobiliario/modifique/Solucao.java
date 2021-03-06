package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.TipoEvento;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model.Garantia;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model.Proponente;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.model.PropostaEmprestimo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Solucao {

    private static final String VALOR_MINIMO_PROPOSTA = "30000";
    private static final String VALOR_MAXIMO_PROPOSTA = "3000000";
    private static final String VALOR_MINIMO_QUANTIDADE_PARCELA = "24";
    private static final String VALOR_MAXIMO_QUANTIDADE_PARCELA = "150";
	
  public static String processMessages(List<String> messages) {

      //Listas
      List<PropostaEmprestimo> listaProposta = new ArrayList<>();
      List<Garantia> listaGarantia = new ArrayList<>();
      List<Proponente> listaProponente = new ArrayList<>();

      for (String linha : messages) {
          String[] atributos = linha.split(",");

          if (TipoEvento.PROPOSAL.getDescricao().equals(atributos[1])){
              final PropostaEmprestimo proposta = adicionaNovaPropostaEmprestimo(atributos);

              if (proposta != null){
                  listaProposta.add(proposta);
              }

          } else if (TipoEvento.WARRANTY.getDescricao().equals(atributos[1])){
              final Garantia garantia = adicionaNovaGarantia(atributos);
              listaGarantia.add(garantia);
          }else {
            Proponente proponente = adicionaNovoProponente(atributos);
              listaProponente.add(proponente);
          }
      }

      String retorno = "";
      //Filtrar listas
      for (PropostaEmprestimo item : listaProposta) {
          retorno+= "," + item.getId();
      }

      return retorno;
  }


//    O valor do empréstimo deve estar entre R$ 30.000,00 e R$ 3.000.000,00
//    O empréstimo deve ser pago em no mínimo 2 (24 meses) anos e no máximo 15 (180 meses) anos
//    Deve haver no mínimo 2 proponentes por proposta
//    Deve haver exatamente 1 proponente principal por proposta
    private static PropostaEmprestimo adicionaNovaPropostaEmprestimo(String[] atributos) {
        //c2d06c4f-e1dc-4b2a-af61-ba15bc6d8610,proposal,created,2019-11-11T13:26:04Z,bd6abe95-7c44-41a4-92d0-edf4978c9f4e,684397.0,72
        UUID idProposta = UUID.fromString(atributos[4]);
        BigDecimal valorTotal = new BigDecimal(atributos[5]);
        Integer quantidadeParcela = Integer.parseInt(atributos[6]);

        final PropostaEmprestimo proposta = new PropostaEmprestimo();
        proposta.setId(idProposta);
        proposta.setValorTotal(valorTotal);
        proposta.setQuantidadeParcela(quantidadeParcela);

        if (proposta.getValorTotal().doubleValue() >= Double.parseDouble(VALOR_MINIMO_PROPOSTA)
        && proposta.getValorTotal().doubleValue() <= Double.parseDouble(VALOR_MAXIMO_PROPOSTA)
        && proposta.getQuantidadeParcela() >= Integer.parseInt(VALOR_MINIMO_QUANTIDADE_PARCELA)
        && proposta.getQuantidadeParcela() <= Integer.parseInt(VALOR_MAXIMO_QUANTIDADE_PARCELA)){
            return proposta;
        }

        return null;
    }

    private static Proponente adicionaNovoProponente(String[] atributos) {
        //05588a09-3268-464f-8bc8-03974303332a,
        // proponent,
        // added,
        // 2019-11-11T13:26:04Z,
        // bd6abe95-7c44-41a4-92d0-edf4978c9f4e,
        // 5f9b96d2-b8db-48a8-a28b-f7ac9b3c8108,
        // Kip Beer,
        // 50,
        // 73300.95,
        // true

        UUID idProposta = UUID.fromString(atributos[4]);
        UUID idProponente = UUID.fromString(atributos[5]);
        String nomeProponente = atributos[6];
        Integer idadeProponente = Integer.valueOf(atributos[7]);
        BigDecimal rendaProponente = new BigDecimal(atributos[8]);
        Boolean oponentePrincipal = Boolean.valueOf(atributos[9]);

        final Proponente proponente = new Proponente();
        proponente.setIdProposta(idProposta);
        proponente.setId(idProponente);
        proponente.setNome(nomeProponente);
        proponente.setIdade(idadeProponente);
        proponente.setRenda(rendaProponente);
        proponente.setPrincipal(oponentePrincipal);

        return proponente;
    }

    private static Garantia adicionaNovaGarantia(String[] atributos) {
        //27179730-5a3a-464d-8f1e-a742d00b3dd3,
        // warranty,
        // added,
        // 2019-11-11T13:26:04Z,
        // bd6abe95-7c44-41a4-92d0-edf4978c9f4e,
        // 6b5fc3f9-bb6b-4145-9891-c7e71aa87ca2,
        // 1967835.53,
        // ES
        UUID idProposta = UUID.fromString(atributos[4]);
        UUID idGarantia = UUID.fromString(atributos[5]);
        BigDecimal valorGarantia = new BigDecimal(atributos[6]);
        String descricaoGarantia = atributos[7];

        final Garantia garantia = new Garantia();
        garantia.setId(idGarantia);
        garantia.setIdProposta(idProposta);
        garantia.setValor(valorGarantia);
        garantia.setDescricao(descricaoGarantia);

        return garantia;
    }
}