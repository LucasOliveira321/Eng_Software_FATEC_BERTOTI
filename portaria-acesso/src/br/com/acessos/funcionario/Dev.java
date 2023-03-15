package br.com.acessos.funcionario;

public class Dev{
	
	private double salario;
	
	public Dev(double salario) {
		this.salario = salario;
		
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		
		return "Desenvolvedor";
	}

}
