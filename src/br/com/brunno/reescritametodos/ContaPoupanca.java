package br.com.brunno.reescritametodos;

public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    void calcularNovoSaldo(float taxa){
        if(this.diaDeRendimento > 10){
            this.setSaldo((this.getSaldo()*taxa/100) + this.getSaldo());
        } else {
            this.setSaldo(((this.getSaldo() * taxa/100) + 1) + this.getSaldo());
        }
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
}
