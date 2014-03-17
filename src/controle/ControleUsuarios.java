package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import modelo.Usuario;

@ManagedBean(name="controleUsuario")
@RequestScoped
public class ControleUsuarios implements Serializable{
	
	private Usuario usuario;
	
	public ControleUsuarios() {
		usuario = new Usuario();
	}
	
	public String recebeDados() {
		FacesMessage msg = new FacesMessage("Dados Recebidos com Suscesso!" 
											+ usuario.getNome());
		FacesContext.getCurrentInstance().addMessage("", msg);;
		return "frmCadUsuarios";
		
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
