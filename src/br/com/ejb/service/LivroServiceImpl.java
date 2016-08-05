package br.com.ejb.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.ejb.model.Livro;
import br.com.ejb.repository.LivroRepository;

@Stateless
public class LivroServiceImpl implements LivroService {

	@EJB
	LivroRepository livroRepository;

	@Override
	public void salvar(Livro livro) {
		this.livroRepository.save(livro);
	}

}
