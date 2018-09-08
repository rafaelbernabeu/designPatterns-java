package openClosedPrinciple.bad;

public class CalculadoraDePrecos {
    public double calcula(Compra produto) {

        Frete correios = new Frete();

        double desconto = 0;
        if ("Regra_1".equals("...")){
            TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
            desconto = tabela.descontoPara(produto.getValor());

        }
        if ("Regra_2".equals("...")){
            TabelaDePrecoDiferenciada tabela = new TabelaDePrecoDiferenciada();
            desconto = tabela.descontoPara(produto.getValor());
        }
        double frete = correios.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}
