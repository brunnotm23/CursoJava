package br.com.brunno.arrays;

public class UtilitarioConta {

    public void imprimirContas(Conta[] a){
        for (int i=0; i < a.length;i++)
            System.out.println("Numero da Conta: " + a[i].getNumero() + ", Saldo: " + a[i].getSaldo());
    }

    public float somarSaldos(Conta[] a){
        float somatorioSaldos=0;
        for(int i=0;i<a.length;i++)
            somatorioSaldos = somatorioSaldos + a[i].getSaldo();
        return somatorioSaldos;
    }
}
