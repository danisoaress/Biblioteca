package br.com.danielle.model;

import java.util.Date;

public class Biblioteca {
	public static void main(String[] args) {
		Usuario joao = new Usuario();
		Usuario maria = new Usuario();

		joao.setNome("João");
		joao.setCpf("999.999.999.999");
		joao.setEmail("joaosilva@hotmail.com");
		joao.setEndereco("Rua 10");
		joao.setSenha("123senha");
		joao.setTelefone("44444444");

		maria.setNome("Maria");
		maria.setCpf("111.111.111.111");
		maria.setEmail("mariasilva@gmail.com");
		maria.setEndereco("Rua 30");
		maria.setSenha("678senha");
		maria.setTelefone("88888888");

		Livro calculo = new Livro();
		calculo.setTitulo("Calculo");
		Autor mario = new Autor();
		mario.setNome("Mario");
		Genero educacional = new Genero();
		educacional.setDescricao("Educacinal");
		Editora educacao = new Editora();
		educacao.setNome("Educação");

		Edicao primeira = new Edicao();
		primeira.setDescricao("Primeira Edição");
		calculo.getAutores().add(mario);
		calculo.setGenero(educacional);
		calculo.setEditora(educacao);
		calculo.getEdicoes().add(primeira);
		joao.getLivros().add(calculo);
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setLivros(calculo);
		emprestimo.setUsuarios(joao);
		
		Livro algebra = new Livro();
		algebra.setTitulo("Algebra");
		joao.getLivros().add(algebra);
		mario.getLivros().add(calculo);
		mario.getLivros().add(algebra);
		calculo.setAno_publicacao(new Date());

		// System.out.println("Joao pegou emprestado: ");
		
		System.out.println("Usuario = " + joao.getNome());
		System.out.println(joao.getLivros());

		
//		for (Livro livros : joao.getLivros()) {
//			for (Autor autores : calculo.getAutores()) {
//				for (Edicao edicoes : calculo.getEdicoes()) {
//
//					System.out.println(joao.getNome()
//							+ " pegou emprestado o livro de "
//							+ livros.getTitulo() + " do autor "
//							+ autores.getNome() + " " + edicoes.getDescricao());
//				}
//			}
//		}

	}

}