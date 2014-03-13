package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Usuario;

@ManagedBean(name="controleUsuario")
@RequestScoped
public class ControleUsuarios implements Serializable{
	
	private Usuario usuario;
	
	public ControleUsuarios() {
		usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
