/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Temas {
    
    private int idTema;
    private String nombreTema;
    private int idAsigFT;

    public Temas(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public Temas(int idTema, String nombreTema, int idAsigFT) {
        this.idTema = idTema;
        this.nombreTema = nombreTema;
        this.idAsigFT = idAsigFT;
    }

    public Temas() {
    }

    /**
     * Get the value of idAsigFT
     *
     * @return the value of idAsigFT
     */
    public int getIdAsigFT() {
        return idAsigFT;
    }

    /**
     * Set the value of idAsigFT
     *
     * @param idAsigFT new value of idAsigFT
     */
    public void setIdAsigFT(int idAsigFT) {
        this.idAsigFT = idAsigFT;
    }

    /**
     * Get the value of nombreTema
     *
     * @return the value of nombreTema
     */
    public String getNombreTema() {
        return nombreTema;
    }

    /**
     * Set the value of nombreTema
     *
     * @param nombreTema new value of nombreTema
     */
    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }


    /**
     * Get the value of idTema
     *
     * @return the value of idTema
     */
    public int getIdTema() {
        return idTema;
    }

    /**
     * Set the value of idTema
     *
     * @param idTema new value of idTema
     */
    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    @Override
    public String toString() {
        return "Temas{" + "idTema=" + idTema + ", nombreTema=" + nombreTema + ", idAsigFT=" + idAsigFT + '}';
    }

}
