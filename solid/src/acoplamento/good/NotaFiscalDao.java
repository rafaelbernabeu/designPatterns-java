package acoplamento.good;

public class NotaFiscalDao implements AcaoAposGerarNota {
    public void persiste(NotaFiscal nf) {
    }

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
