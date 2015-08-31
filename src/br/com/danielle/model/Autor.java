package br.com.danielle.model;
import java.util.List;
import java.util.ArrayList;

public class Autor {
	private Long id;
	private String nome;
	private String nacionalidade;
	private List<Livro> livros = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	@Override
	public String toString() {
		return  nome ;
	}
	

}
