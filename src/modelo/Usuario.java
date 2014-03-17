package modelo;

import java.io.Serializable;

import org.hibernate.validator.constraints.*;

public class Usuario implements Serializable{

	@NotEmpty (message="O Nome deve ser informado")
	private String nome;
	@Email(message = "Insira um Email válido")
	@NotEmpty
	private String email;
	@NotEmpty(message="Username deve ser inserido")
	private String username;
	@NotEmpty(message = "Senha deve ser inserida")
	private String senha;
	@NotEmpty(message = "A Confirmação de Senha deve ser inserida")
	private String confirmasenha;
	


	public Usuario(){
		this.nome = "";
		this.email = "";
		this.username = "";
		this.senha = "";		
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
	
	public String getConfirmasenha() {
		return confirmasenha;
	}

	public void setConfirmasenha(String confirmasenha) {
		this.confirmasenha = confirmasenha;
	}
	
	
}
