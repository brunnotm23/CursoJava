package br.com.brunno.associacoes;

public class Comprador {
    public String nome;
    private float dinheiro;

    public float compra(Produto prod, Vendedor vend){
        System.out.println(prod.nome +" comprado do vendedor " + vend.nome);
        this.dinheiro = this.dinheiro - prod.preco;
        return prod.preco;
    }
}
