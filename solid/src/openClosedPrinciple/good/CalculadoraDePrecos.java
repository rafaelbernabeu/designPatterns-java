package openClosedPrinciple.good;

import openClosedPrinciple.bad.Compra;
import openClosedPrinciple.bad.Frete;
import openClosedPrinciple.bad.TabelaDePrecoDiferenciada;
import openClosedPrinciple.bad.TabelaDePrecoPadrao;

public class CalculadoraDePrecos {

    TabelaDePreco tabelaDePreco;
    ServicoDeEntrega servicoDeEntrega;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
        this.tabelaDePreco = tabela;
        this.servicoDeEntrega = entrega;
    }

    public double calcula(Compra produto) {
        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = servicoDeEntrega.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}
