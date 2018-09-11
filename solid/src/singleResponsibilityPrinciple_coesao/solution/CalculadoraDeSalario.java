package singleResponsibilityPrinciple_coesao.solution;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }

    public double calcula2(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcula(funcionario);
    }

}