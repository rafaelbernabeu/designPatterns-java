package problem;

public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento) {
        // verifica primeira regra de possível desconto
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }

        // verifica segunda regra de possível desconto
        else if(orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        }

        // verifica terceira, quarta, quinta regra de possível desconto ...
        // um monte de ifs daqui pra baixo
        return 0;
    }

    public double calcula2 (Orcamento orcamento) {
        // vai chamando os descontos na ordem até que algum deles dê diferente de zero...
        double desconto = new DescontoPorMaisDeCincoItens().desconta(orcamento);
        if(desconto == 0)
            desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
        if(desconto == 0)
            desconto = new ProximoDesconto().desconta(orcamento);
        // ...

        return 0;
    }

}
