package liskovDubstitutionPrinciple_heranca.good;

public class ContaDeEstudante extends ContaComum {

    private ManipuladorDeSaldo m;
    private int milhas;

    public ContaDeEstudante() {
        m = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        m.deposita(valor);
        this.milhas += (int) valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public double getSaldo() {
        return m.getSaldo();
    }
}
