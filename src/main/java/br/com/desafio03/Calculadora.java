package br.com.desafio03;

import br.com.desafio03.tipos.Multiplicador;
import br.com.desafio03.tipos.Multiplicando;
import br.com.desafio03.tipos.Resultado;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    Integer soma, sub;


    public int soma(Integer num, Integer num2) {
        soma = num + num2;
        return soma;
    }

    public Integer subtracao(String num, Integer num2) {
        sub = Integer.parseInt(num) - num2;
        return sub;
    }

    public Resultado multiplicacao(Multiplicador multiplicador, Multiplicando multiplicando) {
        return new Resultado(multiplicador.number * multiplicando.number);
    }

    public List<Resultado> multiplicacao(Multiplicando multiplicando, Multiplicador multiplicador) {
        Resultado result = new Resultado(multiplicador.number * multiplicando.number);
        List<Resultado> resultList = new ArrayList<>();
        resultList.add(result);
        return resultList;
    }


}
