package br.com.brunno.associacoes;

public class Vendedor {

    public String nome;
    public String registro;
    public float comissao;
    private float totalComissao;

    public void vende(Produto prod, Comprador cliente, Vendedor vend){
        cliente.compra(prod, vend);
        System.out.println("Produto " + prod.nome + " Vendido!");
        this.totalComissao = this.totalComissao + (prod.preco*this.comissao);
    }
}
