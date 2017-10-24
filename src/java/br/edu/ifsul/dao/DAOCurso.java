/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Curso;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gustavo
 */
@Stateless
public class DAOCurso implements Serializable {
    
    @PersistenceContext(unitName = "EducacionalEJBPU")
    private EntityManager em;
    private List<Curso> lista;
    
    public List<Curso> getLista() {
        return em.createQuery("from Curso order by nome").getResultList();
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void setLista(List<Curso> lista) {
        this.lista = lista;
    }
    
    
    
}
