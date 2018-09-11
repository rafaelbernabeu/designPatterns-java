package problem;

class TemplateDeImpostoCondicional implements Imposto {
    public double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }

    }

    private double minimaTaxacao(Orcamento orcamento) {
        return 0;
    }

    private double maximaTaxacao(Orcamento orcamento) {
        return 0;
    }

    private boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return false;
    }
}
