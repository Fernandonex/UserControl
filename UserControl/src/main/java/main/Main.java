package main;
import static util.GerenciadorJson.gerarJson;

import model.Usuario;
import util.DAOUsuario;

public class Main {

	static DAOUsuario dao = new DAOUsuario();
	public static void main(String[] args) {
		//System.out.println(gerarJson(new Usuario("Fernando", "CPF", "email", "senha")));
		
		//Usuario user = new Usuario("Fernando", "CPF", "email", "senha");
		//dao.inserir(user);
	}
	
	
}
