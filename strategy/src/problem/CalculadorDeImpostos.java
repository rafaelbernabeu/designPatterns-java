package problem;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, String imposto) {

        if( "ICMS".equals(imposto) ) {

            double icms = new ICMS().calculaICMS(orcamento);
            System.out.println(icms); // imprimirá 50.0

        } else if( "ISS".equals(imposto) ) {

            double iss = new ISS().calculaISS(orcamento);
            System.out.println(iss); // imprimirá 30.0

        }
    }

    public void realizaCalculoICMS(Orcamento orcamento) {

        double icms = new ICMS().calculaICMS(orcamento);
        System.out.println(icms);

    }

    public void realizaCalculoISS(Orcamento orcamento) {

        double iss = new ISS().calculaISS(orcamento);
        System.out.println(iss);

    }
}