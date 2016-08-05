package br.com.ejb.repository.generics;

import java.util.List;

public interface CrudRepository<T> {

	public void save(T entity);

	public List<T> listAll();

	public void delete(long id);

}
