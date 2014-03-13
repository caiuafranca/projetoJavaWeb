package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "olaController")
@SessionScoped
public class OlaController implements Serializable {
	
private String mensagem;	
	
public OlaController() {
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
	mensagem = "Seja Bem Vindo! " + data.format(Calendar.getInstance().getTime());
}

public String sobre(){
	mensagem = "Pagina Sobre do Sistema";
	return "sobre";
}

public String sobreMetodo(){
	mensagem = "Pagina Sobre do Sistema pelo metodo";
	return "sobre";
}

public String sobreRedirect(){
	mensagem = "Pagina Sobre do Sistema";
	return "sobre?faces-redirect=true";
}

public String login(){
	return "loginPage?faces-redirect=true";
}

public String frmCadastroUsuarios(){
	return "frmCadUsuarios?faces-redirect=true";
}

public String getMensagem() {
	return mensagem;
}

public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}

}
