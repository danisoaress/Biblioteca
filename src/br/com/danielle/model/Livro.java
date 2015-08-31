package br.com.danielle.model;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Livro {
	private Long id;
	private String titulo;
	private Date ano_publicacao;
	private Genero genero;
	private List<Autor> autores = new ArrayList<>();
	private List<Edicao> edicoes = new ArrayList<>();
	private Editora editoras;
	private Usuario usuarios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public List<Edicao> getEdicoes() {
		return edicoes;
	}
	public void setEdicoes(List<Edicao> edicoes) {
		this.edicoes = edicoes;
	}
	public Editora getEditoras() {
		return editoras;
	}
	public void setEditora(Editora editoras) {
		this.editoras = editoras;
	}
	public Usuario getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", genero=" + genero + ", autores="
				+ autores + "]";
	}
	
	

}
