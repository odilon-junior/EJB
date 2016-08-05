package br.com.ejb.repository.generics;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class CrudRepositoryImpl<T> implements CrudRepository<T> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List listAll() {
		return null;
	}

	@Override
	public void delete(long id) {
		this.entityManager.remove(id);
	}

	@Override
	public void save(T entity) {
		this.entityManager.persist(entity);
	}

	// public CrudRepositoryImpl() {
	// ParameterizedType genericSuperclass = (ParameterizedType) getClass()
	// .getGenericSuperclass();
	// this.typeClass = (Class) genericSuperclass.getActualTypeArguments()[1];
	// }
}
