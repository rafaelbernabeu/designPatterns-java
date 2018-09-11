package liskovDubstitutionPrinciple_heranca.solution;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) throws ContaNaoRendeException {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static ContaComum[] contasDoBanco() {
        return new ContaComum[0];
    }
}
