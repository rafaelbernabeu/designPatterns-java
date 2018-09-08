package encapsulamento.bad;

import java.util.Collection;

public class Fatura {

    private Collection<Pagamento> pagamentos;
    private double valor;
    private boolean pago;

    public Collection<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public double getValor() {
        return valor;
    }

    public void setPago(boolean b) {
        this.pago = b;
    }
}
