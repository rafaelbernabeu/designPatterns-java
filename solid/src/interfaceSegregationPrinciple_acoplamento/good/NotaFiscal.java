package interfaceSegregationPrinciple_acoplamento.good;

public class NotaFiscal {

    private double valor;

    public NotaFiscal(double valor, double impostoSimplesSobreO) {
        NotaFiscal nf = new NotaFiscal();
        this.valor = nf.calculaValorImposto();
    }

    public NotaFiscal() {

    }

    private double calculaValorImposto() {
        return 0;
    }
}
