package br.com.desafio03;

public class Calculadora {

    public int soma(Integer num, Integer num2) {
        int soma = num + num2;
        return soma;
    }

    public Integer subtracao(String num, Integer num2) {
        int sub = Integer.parseInt(num) - num2;
        System.out.println(sub);
        return sub;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.subtracao("6",3);
    }

}
