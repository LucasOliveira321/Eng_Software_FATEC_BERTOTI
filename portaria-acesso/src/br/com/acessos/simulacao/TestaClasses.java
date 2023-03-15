package br.com.acessos.simulacao;

import br.com.acessos.funcionario.*;
import br.com.acessos.empresa.EmpresaUm;
import br.com.acessos.areas.*;

public class TestaClasses {

	public static void main(String[] args) {
		
		Refeitorio ref = new Refeitorio();
		Producao prod = new Producao();
		Estoque est = new Estoque();
		
		EmpresaUm aosData = new EmpresaUm("AosData");
		
		Analista ana = new Analista(3000);
		Gerente ger = new Gerente(6000);
		Dev dev = new Dev(5000);
		
		Funcionario lucas = new Funcionario("Lucas",aosData, dev);
		Funcionario joao = new Funcionario("Joao",aosData, ana);
		Funcionario maria = new Funcionario("Maria",aosData, ger);
		
		lucas.adicionaAcesso(ref);
		lucas.adicionaAcesso(prod);
		lucas.adicionaAcesso(est);
		
		System.out.println(lucas.getAcessos());
		
		lucas.removeAcesso(prod);
		
		System.out.println(lucas.getAcessos());
		
		System.out.println(est.validaAcesso(maria, est));
		
	}

}
