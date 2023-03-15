package br.com.acessos.funcionario;

public class Gerente{
	
	private double salario;
	
	public Gerente(double salario) {
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
		
		return "Gerente";
	}
}
