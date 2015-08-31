package br.com.danielle.model;
import java.util.List;
import java.util.ArrayList;

public class Usuario extends Pessoa {
	
	private String email;
	private String senha;
	private List<Livro> livros = new ArrayList<>();
	
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
