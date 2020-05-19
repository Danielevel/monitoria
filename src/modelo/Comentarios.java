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
public class Comentarios {

    private int idComentario;
    private String comentarioC;
    private String codigoPFC;
    private String codigoEFC;
    private int idRespuestaFC;

    public Comentarios() {
    }

    public Comentarios(int idComentario, String comentarioC, String codigoPFC, String codigoEFC, int idRespuestaFC) {
        this.idComentario = idComentario;
        this.comentarioC = comentarioC;
        this.codigoPFC = codigoPFC;
        this.codigoEFC = codigoEFC;
        this.idRespuestaFC = idRespuestaFC;
    }

    public Comentarios(String comentarioC) {
        this.comentarioC = comentarioC;
    }

    /**
     * Get the value of idRespuestaFC
     *
     * @return the value of idRespuestaFC
     */
    public int getIdRespuestaFC() {
        return idRespuestaFC;
    }

    /**
     * Set the value of idRespuestaFC
     *
     * @param idRespuestaFC new value of idRespuestaFC
     */
    public void setIdRespuestaFC(int idRespuestaFC) {
        this.idRespuestaFC = idRespuestaFC;
    }


    /**
     * Get the value of codigoEFC
     *
     * @return the value of codigoEFC
     */
    public String getCodigoEFC() {
        return codigoEFC;
    }

    /**
     * Set the value of codigoEFC
     *
     * @param codigoEFC new value of codigoEFC
     */
    public void setCodigoEFC(String codigoEFC) {
        this.codigoEFC = codigoEFC;
    }


    /**
     * Get the value of codigoPFC
     *
     * @return the value of codigoPFC
     */
    public String getCodigoPFC() {
        return codigoPFC;
    }

    /**
     * Set the value of codigoPFC
     *
     * @param codigoPFC new value of codigoPFC
     */
    public void setCodigoPFC(String codigoPFC) {
        this.codigoPFC = codigoPFC;
    }


    /**
     * Get the value of comentarioC
     *
     * @return the value of comentarioC
     */
    public String getComentarioC() {
        return comentarioC;
    }

    /**
     * Set the value of comentarioC
     *
     * @param comentarioC new value of comentarioC
     */
    public void setComentarioC(String comentarioC) {
        this.comentarioC = comentarioC;
    }


    /**
     * Get the value of idComentario
     *
     * @return the value of idComentario
     */
    public int getIdComentario() {
        return idComentario;
    }

    /**
     * Set the value of idComentario
     *
     * @param idComentario new value of idComentario
     */
    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "idComentario=" + idComentario + ", comentarioC=" + comentarioC + ", codigoPFC=" + codigoPFC + ", codigoEFC=" + codigoEFC + ", idRespuestaFC=" + idRespuestaFC + '}';
    }
    
}
