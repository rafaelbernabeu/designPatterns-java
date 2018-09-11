package interfaceSegregationPrinciple_acoplamento.problem;

public class NotaFiscal {
    public NotaFiscal(double valor, double impostoSimplesSobreO) {
        NotaFiscal nf = new NotaFiscal();
        if (nf.getValorSemImposto() > 10000) {
            valor = 0.06 * nf.getValor();
        } else {
            valor = 0.12 * nf.getValor();
        }
    }

    private double getValor() {
        return 0;
    }

    public NotaFiscal() {

    }

    private int getValorSemImposto() {
        return 0;
    }
}
