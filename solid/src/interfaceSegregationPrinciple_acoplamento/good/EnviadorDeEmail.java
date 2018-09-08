package interfaceSegregationPrinciple_acoplamento.good;

public class EnviadorDeEmail implements AcaoAposGerarNota {
    public void enviaEmail(NotaFiscal nf) {
    }

    @Override
    public void executa(NotaFiscal nf) {

    }
}
