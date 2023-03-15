package br.com.acessos.funcionario;

import java.util.ArrayList;

public class Funcionario {
	
	private String nome;
	protected Object cargo;
	private Object empresa;
	private ArrayList<Object> acessos = new ArrayList<Object>();
	

	public Funcionario(String nome, Object empresa, Object cargo) {
		setNome(nome);
		setEmpresa(empresa);
		setCargo(cargo);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Object getCargo() {
		return this.cargo;
	}
	
	public Object getEmpresa() {
		return this.empresa;
	}
	
	public ArrayList<Object> getAcessos(){
		return this.acessos;
	}
	
	//////////////////////////////////////////////
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(Object cargo) {
		this.cargo = cargo;
	}
	public void setEmpresa(Object empresa) {
		this.empresa = empresa;
	}
	public void adicionaAcesso(Object area) {
		this.acessos.add(area);
	}
	public void removeAcesso(Object area) {
		this.acessos.remove(area);
	}

}
