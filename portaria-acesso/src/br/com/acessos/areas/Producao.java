package br.com.acessos.areas;

import br.com.acessos.funcionario.Funcionario;

public class Producao {
	
	private String nomeDaArea = "Producao";
	
	public Producao() {
	}
	
	public String getSetor() {
		return this.nomeDaArea;
	}
	
	public boolean validaAcesso(Funcionario func, Object area) {
		if(func.getAcessos().contains(area)){
			return true;
		}else {
		return false;
		}
	}
	
	@Override
	public String toString() {
		return this.nomeDaArea;
	}
}
