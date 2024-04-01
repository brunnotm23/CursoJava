package br.com.brunno.associacoes;

public class Venda {
    Comprador c;
    Vendedor v;
    Produto p;

    public void concretizaVenda(){
        v.vende(p,c,v);
    }
    public void cancelaVenda(){
        System.out.println("Venda Cancelada");
    }
}
