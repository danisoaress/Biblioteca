package br.com.danielle.model;
import java.util.Date;
public class Reserva {
	private Date data_reserva;
	private Livro livros;
	private Usuario usuarios;
	
	public Date getData_reserva() {
		return data_reserva;
	}
	public void setData_reserva(Date data_reserva) {
		this.data_reserva = data_reserva;
	}
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

}
