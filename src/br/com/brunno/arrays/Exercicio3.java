package br.com.brunno.arrays;

public class Exercicio3 {

    public static void main(String[] args){

        // inicializando objetos
        Conta listaContas[] = new Conta[10];

        for(int i=0 ; i<listaContas.length ; i++){
            listaContas[i] = new Conta("placeholder", 1000);
        }

        UtilitarioConta utilitario = new UtilitarioConta();

        // usando métodos
        utilitario.imprimirContas(listaContas);
        System.out.println(utilitario.somarSaldos(listaContas));

    }
}
