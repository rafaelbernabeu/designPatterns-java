package liskovDubstitutionPrinciple_heranca.solution;

public class ContaComum {

    protected double saldo;
    private ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.saldo = 0;
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void rende() {
        this.manipulador.rende(1.1);
    }

    public void deposita(double valor) {
        this.manipulador.deposita(valor);
    }

    public void saca(double valor) {
        manipulador.saca(valor);
    }

    public double getSaldo() {
        return manipulador.getSaldo();
    }
}