/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

/**
 *
 * @author carls
 */
public class Barco {
    private int NumeroMatricula;
    private String nombre;
    private int amarre;
    private float cuota;
    
    public Barco() {
    }

    public Barco(int NumeroMatricula, String nombre, int amarre, float cuota) {
        this.NumeroMatricula = NumeroMatricula;
        this.nombre = nombre;
        this.amarre = amarre;
        this.cuota=cuota;
    }

    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }
    
    
    
    
    
    
    
}
