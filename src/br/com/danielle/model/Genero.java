package br.com.danielle.model;
import java.util.List;
import java.util.ArrayList;

public class Genero {
	private Long id;
	private String descricao;
	private List<Livro> livros = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	@Override
	public String toString() {
		return descricao;
	}

	
}
