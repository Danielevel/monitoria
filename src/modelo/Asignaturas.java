/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HEWLETT PACKARD
 */
public class Asignaturas {
    
    private int idAsig;
    private String nombreAsig;

    public Asignaturas() {
    }

    public Asignaturas(int idAsig, String nombreAsig) {
        this.idAsig = idAsig;
        this.nombreAsig = nombreAsig;
    }

    public Asignaturas(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }
    

    /**
     * Get the value of nombreAsig
     *
     * @return the value of nombreAsig
     */
    public String getNombreAsig() {
        return nombreAsig;
    }

    /**
     * Set the value of nombreAsig
     *
     * @param nombreAsig new value of nombreAsig
     */
    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }


    /**
     * Get the value of idAsig
     *
     * @return the value of idAsig
     */
    public int getIdAsig() {
        return idAsig;
    }

    /**
     * Set the value of idAsig
     *
     * @param idAsig new value of idAsig
     */
    public void setIdAsig(int idAsig) {
        this.idAsig = idAsig;
    }

    @Override
    public String toString() {
        return "Asignaturas{" + "idAsig=" + idAsig + ", nombreAsig=" + nombreAsig + '}';
    }

    
}