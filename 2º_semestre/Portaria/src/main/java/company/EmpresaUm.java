package company;

import java.util.ArrayList;
import user.User;

public class EmpresaUm {
	
	private String nome;
	private ArrayList<User> funcionarios = new ArrayList<User>();
	
	public EmpresaUm (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public ArrayList<User> getFuncionarios(){
		return this.funcionarios;
	}
	
	public void contrataFuncionario(User func) {
		funcionarios.add(func);
	}

}
