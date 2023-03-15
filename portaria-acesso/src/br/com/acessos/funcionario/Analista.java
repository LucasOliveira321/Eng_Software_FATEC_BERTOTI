package br.com.acessos.funcionario;

public class Analista{
	
	private double salario;
	
	public Analista(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Analista";
	}
	

}
