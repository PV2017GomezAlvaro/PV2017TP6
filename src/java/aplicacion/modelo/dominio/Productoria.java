/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Alumno
 */
public class Productoria {
    private int n1;
    private int n2;

    public Productoria() {
    }

    public Productoria(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    
    
    public void asignarValor (int num1, int num2){
        n1=num1;
        n2=num2;
    }
    public int obtenerProductoria () {
        int valorProductoria=1;
        int aux1=n1;
        int aux2=n2;
        int i;
        for (i=aux2;i>=aux1;i--) {
            valorProductoria=valorProductoria*i;
        }
        return valorProductoria;
    }

    public void asignarValor(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
