package liskovDubstitutionPrinciple_heranca.problem;

public class ContaDeEstudante extends ContaComum {

    public void rende() throws ContaNaoRendeException {
        throw new ContaNaoRendeException();
    }
}
