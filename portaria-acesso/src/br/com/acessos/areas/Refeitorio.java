package br.com.acessos.areas;

import br.com.acessos.funcionario.Funcionario;

public class Refeitorio {
	
	private String nomeDaArea = "Refeitorio";
	
	public Refeitorio() {
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
