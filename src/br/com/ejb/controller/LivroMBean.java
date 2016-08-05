package br.com.ejb.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.ejb.model.Livro;
import br.com.ejb.service.LivroService;

@ManagedBean
@RequestScoped
public class LivroMBean {

	@EJB
	private LivroService livroService;

	private Livro livro;

	@PostConstruct
	public void inicializar() {
		this.livro = new Livro();
	}

	public void salvar() {
		this.livroService.salvar(this.livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
