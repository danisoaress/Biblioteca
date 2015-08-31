package br.com.danielle.model;
import java.util.Date;
public class Emprestimo {
	private Livro livros;
	private Usuario usuarios;
	private Date data_emprestimo;

	public Livro getLivros() {
		return livros;
	}

	public void setLivros(Livro livros) {
		this.livros = livros;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}
	
	

}
