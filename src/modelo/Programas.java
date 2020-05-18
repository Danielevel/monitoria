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
public class Programas {
    
    private int idPrograma;
    private String nombrePrograma;

    public Programas() {
    }

    public Programas(int idPrograma, String nombrePrograma) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
    }
    

    /**
     * Get the value of nombrePrograma
     *
     * @return the value of nombrePrograma
     */
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    /**
     * Set the value of nombrePrograma
     *
     * @param nombrePrograma new value of nombrePrograma
     */
    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }


    /**
     * Get the value of idPrograma
     *
     * @return the value of idPrograma
     */
    public int getIdPrograma() {
        return idPrograma;
    }

    /**
     * Set the value of idPrograma
     *
     * @param idPrograma new value of idPrograma
     */
    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Override
    public String toString() {
        return "Programas{" + "idPrograma=" + idPrograma + ", nombrePrograma=" + nombrePrograma + '}';
    }

}
