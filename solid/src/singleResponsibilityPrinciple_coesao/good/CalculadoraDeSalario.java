package singleResponsibilityPrinciple_coesao.good;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }

    public double calcula2(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcula(funcionario);
    }

}