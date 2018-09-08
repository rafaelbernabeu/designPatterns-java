package liskovDubstitutionPrinciple_heranca.bad;

public class ContaDeEstudante extends ContaComum {

    public void rende() throws ContaNaoRendeException {
        throw new ContaNaoRendeException();
    }
}
