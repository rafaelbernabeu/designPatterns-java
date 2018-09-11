package encapsulamento.solution;

import java.util.Collection;

public class Fatura {

    private Collection<Pagamento> pagamentos;
    private double valor;
    private boolean pago;

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        if (valorTotalDosPagamentos() >= this.valor) {
            this.pago = true;
        }
    }

    private double valorTotalDosPagamentos() {
        double total = 0;

        for (Pagamento p : pagamentos) {
            total += p.getValor();
        }
        return total;
    }


    public Collection<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public double getValor() {
        return valor;
    }

}
