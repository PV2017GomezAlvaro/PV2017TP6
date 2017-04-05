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
public class Sumatoria {
    private int n;

    public Sumatoria() {
    }

    public Sumatoria(int n) {
        this.n = n;
    }
    
    public void asignarValor (int num){
        n=num;
    }
    
    public int obtenerSumatoria () {
        int valorSumatoria=0;
        int aux=n;
        int i;
        for (i=aux;i>=0;i--) {
            valorSumatoria=valorSumatoria+i;
        }
        return valorSumatoria;
    }
    
}
