package br.com.brunno.reescritametodos;

public class Contas {

    public static void main(String[] args) {
        // Conta 1 ======================
        ContaBancaria obj1 = new ContaBancaria("Brunno", 23, 1250);
        obj1.depositar(500);
        obj1.sacar(4000);
        obj1.mostrarDadosDaConta();
        // Conta 2 ======================
        ContaPoupanca obj2 = new ContaPoupanca("Joseca", 24, 1300, 5);
        obj2.calcularNovoSaldo(10);
        obj2.mostrarDadosDaConta();
        // Conta 3 ======================
        ContaEspecial obj3 = new ContaEspecial("Lucas", 25, 2000, 1000);
        obj3.sacar(2500);
        obj3.sacar(1000);
        obj3.mostrarDadosDaConta();
    }
}
