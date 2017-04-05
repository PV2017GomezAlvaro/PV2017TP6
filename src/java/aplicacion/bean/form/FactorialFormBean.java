/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.FactorialN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class FactorialFormBean {
private int n;
    /**
     * Creates a new instance of FactorialFormBean
     */
    public FactorialFormBean() {
    }
    public int calcularFactorial(){
        FactorialN unFactorial = new FactorialN();
        unFactorial.asignarValor(n);
        return unFactorial.obtenerFactorial();
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
