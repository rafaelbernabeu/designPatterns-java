package solution;

class ImpostoY extends TemplateDeImpostoCondicional {

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        // retorna verdadeiro caso algum item seja maior que 100 reais
        return false;
    }
}
