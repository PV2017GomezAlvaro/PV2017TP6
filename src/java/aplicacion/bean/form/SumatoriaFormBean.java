/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.Sumatoria;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class SumatoriaFormBean {
    private int n;

    public SumatoriaFormBean() {
    }

    public SumatoriaFormBean(int n) {
        this.n = n;
    }
    
    public int calcularSumatoria (){
        Sumatoria unaSumatoria = new Sumatoria();
        unaSumatoria.asignarValor(getN());
        return unaSumatoria.obtenerSumatoria();
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
    
}
