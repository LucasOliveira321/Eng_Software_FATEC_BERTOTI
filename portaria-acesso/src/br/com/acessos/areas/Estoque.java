package br.com.acessos.areas;

import br.com.acessos.funcionario.*;

public class Estoque {
	
	private String nomeDaArea = "Estoque";
	
	public Estoque() {
	}
	
	public String getSetor() {
		return this.nomeDaArea;
	}
	
	public Object getClasse() {
		return this.getClass();
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
