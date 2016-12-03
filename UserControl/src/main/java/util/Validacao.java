package util;

import java.time.LocalDate;
import java.time.Month;

import model.Usuario;

public class Validacao {
	static DAOUsuario dao = new DAOUsuario();
	
	public static boolean verificarUsuario(String email, String senha){
		return dao.listarUsuarios().stream().anyMatch((obj) -> obj.getSenha().equals(senha) && obj.getEmail().equals(email));
	}
	
	public static void main(String[] args) {
	Usuario user = new Usuario("Fernando", "123", "fernando_latrel", "123456", LocalDate.of(1996, Month.JUNE, 07));
		dao.inserir(user);
		System.out.println(dao.listarUsuarios().size());
		//System.out.println(verificarEmail(user.getEmail()));
		//System.out.println(verificarSenha(user.getSenha()));
		System.out.println(verificarUsuario(user.getEmail(), "123"));
	}
	
}
