/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gustavo
 */
public class TesteInserirCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EducacionalEJBPULocal");
        EntityManager em = emf.createEntityManager();

        try {
            Curso c = new Curso();
            c.setNome("Curso de Java EE");
            c.setDescricao("Curso de Java EE com EJB e JSF");
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

}
