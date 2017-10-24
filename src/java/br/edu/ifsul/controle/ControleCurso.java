/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.controle;

import br.edu.ifsul.dao.DAOCurso;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Gustavo
 */
@ManagedBean(name = "controleCurso")
@ViewScoped
public class ControleCurso implements Serializable {
    
    @EJB
    private DAOCurso dao;

    public DAOCurso getDao() {
        return dao;
    }

    public void setDao(DAOCurso dao) {
        this.dao = dao;
    }
    
    
}
