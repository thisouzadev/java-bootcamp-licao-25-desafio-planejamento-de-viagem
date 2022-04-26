package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;
    this.tempoVoo = (int) Math.round(duracaoDouble);
    return this.tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    String partidaStr = "Partida: " + embarque + "\n";
    String origemStr = "Origem: " + origem + "\n\n";
    String chegadaStr = "Chegada: " + desembarque + "\n";
    String destinoStr = "Destino: " + destino + "\n\n";

    return partidaStr.concat(origemStr).concat(chegadaStr).concat(destinoStr);
  }
}
