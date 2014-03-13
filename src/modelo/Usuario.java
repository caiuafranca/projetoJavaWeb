package modelo;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Usuario implements Serializable{

	@NotEmpty (message="o Nome deve ser informado")
	private String nome;
	@Email(message = "insira um Email válido")
	private String email;
	@NotEmpty(message="Username deve ser inserido")
	private String username;
	@NotEmpty(message = "senha deve ser inserida")
	private String senha;
	
	public Usuario(){
		this.nome = "";
		this.email = "";
		this.username = "";
		this.senha = "";		
	}
	
	public String cadastroUsuarios(){
		
		return "Usuario Cadastrado com Sucesso!";		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
