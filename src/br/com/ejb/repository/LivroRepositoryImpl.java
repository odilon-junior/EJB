package br.com.ejb.repository;

import javax.ejb.Stateless;

import br.com.ejb.model.Livro;
import br.com.ejb.repository.generics.CrudRepositoryImpl;

@Stateless
public class LivroRepositoryImpl extends CrudRepositoryImpl<Livro> implements
		LivroRepository {

}
