package encapsulamento.problem;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        double total = 0;
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(),
                    MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);

            total += fatura.getValor();
        }

        if (total >= fatura.getValor()) { //regra deveria estar na classe Fatura
            fatura.setPago(true);
        }
    }
}
