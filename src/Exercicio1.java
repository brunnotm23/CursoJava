//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1 {

    public static void main(String[] args) {

        // Criando tablets
        Tablet tablet1 = new Tablet();
        Tablet tablet2 = new Tablet();

        // Alterando atributos
        tablet1.user = "Brunno";
        tablet2.user = "Beatriz";

        // Criando boletos
        Boleto boleto1 = new Boleto();
        Boleto boleto2 = new Boleto();

        // Alterando atributos
        boleto1.valor = 350;
        boleto2.valor = 415;

        // Utilizando métodos
        tablet1.abrirApp("Google");
        tablet1.pesquisar("Sanduíche");

        boleto1.pagarBoleto();
    }
}