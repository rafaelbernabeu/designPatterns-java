package solution;

import problem.Orcamento;

public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();

        d1.setProximo(d2);

        return d1.desconta(orcamento);
    }
}
