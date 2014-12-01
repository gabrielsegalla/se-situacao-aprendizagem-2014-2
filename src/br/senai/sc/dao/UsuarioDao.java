package br.senai.sc.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.entity.Usuario;
import br.senai.sc.utils.JpaUtils;

public class UsuarioDao {

	private EntityManager entityManager;

	public UsuarioDao() {
		JpaUtils.getInstance().createEntityManagerFactory();
		entityManager = JpaUtils.getInstance().getEntityManager();
	}

	public Usuario salvar(Usuario usuario) {
		entityManager.getTransaction().begin();
		try {
			if (usuario.getId() == null) {
				entityManager.persist(usuario);
			} else {
				entityManager.merge(usuario);
			}
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,
					null, e);
		}
		entityManager.close();
		return usuario;
	}

	public void remover(int id) {
		try {
			entityManager.getTransaction().begin();
			Usuario usuario = entityManager.getReference(Usuario.class, id);
			entityManager.remove(usuario);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,
					null, e);
		}
		entityManager.close();
	}

	public List<Usuario> listar() {
		Query query = entityManager.createQuery("From Usuario", Usuario.class);
		return query.getResultList();
	}

	public Usuario buscarPorId(int id) {
		return entityManager.find(Usuario.class, id);
	}

	public List<Usuario> buscarPorNome(String nome) {
		Query query = entityManager.createQuery(
				"From Usuario u where u.nome LIKE :nome", Usuario.class);
		query.setParameter("nome", nome);
		return query.getResultList();
	}

	public Usuario buscaPorCpf(String cpf) {
		Query query = entityManager.createQuery(
				"From Usuario u where u.cpf LIKE :cpf", Usuario.class);
		query.setParameter("cpf", cpf);
		return (Usuario) query.getSingleResult();
	}
	
	public List<Usuario> buscarRanking(){
		Query query = entityManager.createQuery("From Usuario order by pontosu DESC ", Usuario.class);
		return query.getResultList();
	}

}
