/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3;

/**
 *
 * @author RAF
 */
public class Matricula {
    private int numeroMatricula;
    private String fecha;
    private double valorMatricula;

    public Matricula(int numeroMatricula, String fecha, double valorMatricula) {
        this.numeroMatricula = numeroMatricula;
        this.fecha = fecha;
        this.valorMatricula = valorMatricula;
    }
    
    
    
    

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
    
    
}
