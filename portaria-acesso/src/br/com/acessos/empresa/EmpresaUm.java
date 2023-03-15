package br.com.acessos.empresa;

import br.com.acessos.funcionario.Funcionario;
import java.util.ArrayList;

public class EmpresaUm {
	
	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public EmpresaUm (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return this.funcionarios;
	}
	
	public void contrataFuncionario(Funcionario func) {
		funcionarios.add(func);
	}

}
