package br.com.brunno.reescritametodos;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    void sacar(float valor){
        if((this.saldo - valor) >= 0)
            this.saldo = this.saldo - valor;
        else
            System.out.println("Não foi possível efetuar o saque, saldo insuficiente");
    }
    void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
    void mostrarDadosDaConta(){
        System.out.println("Número da conta: " + this.numConta + "\nCliente: " +
                this.cliente + "\nSaldo: " + this.saldo );
    }
   // getters e setters:
    float getSaldo(){
        return this.saldo;
    }
    void setSaldo(float novoSaldo){
        this.saldo = novoSaldo;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getCliente() {
        return cliente;
    }
    public int getNumConta() {
        return numConta;
    }
}
