package util;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class DAOUsuario {
	private static List<Usuario> usuarios = new ArrayList<Usuario>();

	public boolean inserir(Usuario user) {
		this.usuarios.add(user);
		System.out.println("Adicionou");
		System.out.println("Tamanho da lista " + usuarios.size());
		return true;
	}

	public List<Usuario> listarUsuarios() {
		return usuarios;
	}

	public Usuario buscar(String email) {
		List<Usuario> retorno = new ArrayList<>();
		usuarios.forEach(n -> {
			if (n.getEmail() != null && n.getEmail().equalsIgnoreCase(email)) {
				retorno.add(n);
			}
		});

		return retorno.get(0);

	}

}
