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
public class Curso {
    
    private int idcurso;
    private String nombreCur;
    private int idAsigFCU;
    private String codigoPFCU;

    public Curso() {
    }

    public Curso(int idcurso, String nombreCur, int idAsigFCU, String codigoPFCU) {
        this.idcurso = idcurso;
        this.nombreCur = nombreCur;
        this.idAsigFCU = idAsigFCU;
        this.codigoPFCU = codigoPFCU;
    }

    public Curso(String nombreCur) {
        this.nombreCur = nombreCur;
    }
    
    

    /**
     * Get the value of codigoPFCU
     *
     * @return the value of codigoPFCU
     */
    public String getCodigoPFCU() {
        return codigoPFCU;
    }

    /**
     * Set the value of codigoPFCU
     *
     * @param codigoPFCU new value of codigoPFCU
     */
    public void setCodigoPFCU(String codigoPFCU) {
        this.codigoPFCU = codigoPFCU;
    }


    /**
     * Get the value of idAsigFCU
     *
     * @return the value of idAsigFCU
     */
    public int getIdAsigFCU() {
        return idAsigFCU;
    }

    /**
     * Set the value of idAsigFCU
     *
     * @param idAsigFCU new value of idAsigFCU
     */
    public void setIdAsigFCU(int idAsigFCU) {
        this.idAsigFCU = idAsigFCU;
    }

    
    

    /**
     * Get the value of nombreCur
     *
     * @return the value of nombreCur
     */
    public String getNombreCur() {
        return nombreCur;
    }

    /**
     * Set the value of nombreCur
     *
     * @param nombreCur new value of nombreCur
     */
    public void setNombreCur(String nombreCur) {
        this.nombreCur = nombreCur;
    }


    /**
     * Get the value of idcurso
     *
     * @return the value of idcurso
     */
    public int getIdcurso() {
        return idcurso;
    }

    /**
     * Set the value of idcurso
     *
     * @param idcurso new value of idcurso
     */
    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

}
