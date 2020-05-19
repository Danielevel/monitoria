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
public class Respuestas {
    
    private int idRespuesta;
    private String FechaR;
    private String HoraR;
    private String respuestaR;
    private String codigoPFR;
    private int idPreguntaFR;

    public Respuestas() {
    }

    public Respuestas(int idRespuesta, String FechaR, String HoraR, String PreguntaR, int idPreguntaFR) {
        this.idRespuesta = idRespuesta;
        this.FechaR = FechaR;
        this.HoraR = HoraR;
        this.respuestaR = PreguntaR;
        this.idPreguntaFR = idPreguntaFR;
    }

    public Respuestas(String FechaR, String HoraR, String PreguntaR) {
        this.FechaR = FechaR;
        this.HoraR = HoraR;
        this.respuestaR = PreguntaR;
    }

    /**
     * Get the value of idPreguntaFR
     *
     * @return the value of idPreguntaFR
     */
    public int getIdPreguntaFR() {
        return idPreguntaFR;
    }

    /**
     * Set the value of idPreguntaFR
     *
     * @param idPreguntaFR new value of idPreguntaFR
     */
    public void setIdPreguntaFR(int idPreguntaFR) {
        this.idPreguntaFR = idPreguntaFR;
    }


    /**
     * Get the value of codigoPFR
     *
     * @return the value of codigoPFR
     */
    public String getCodigoPFR() {
        return codigoPFR;
    }

    /**
     * Set the value of codigoPFR
     *
     * @param codigoPFR new value of codigoPFR
     */
    public void setCodigoPFR(String codigoPFR) {
        this.codigoPFR = codigoPFR;
    }


    /**
     * Get the value of PreguntaR
     *
     * @return the value of PreguntaR
     */
    public String getPreguntaR() {
        return respuestaR;
    }

    /**
     * Set the value of PreguntaR
     *
     * @param PreguntaR new value of PreguntaR
     */
    public void setPreguntaR(String PreguntaR) {
        this.respuestaR = PreguntaR;
    }


    /**
     * Get the value of HoraR
     *
     * @return the value of HoraR
     */
    public String getHoraR() {
        return HoraR;
    }

    /**
     * Set the value of HoraR
     *
     * @param HoraR new value of HoraR
     */
    public void setHoraR(String HoraR) {
        this.HoraR = HoraR;
    }

    /**
     * Get the value of FechaR
     *
     * @return the value of FechaR
     */
    public String getFechaR() {
        return FechaR;
    }

    /**
     * Set the value of FechaR
     *
     * @param FechaR new value of FechaR
     */
    public void setFechaR(String FechaR) {
        this.FechaR = FechaR;
    }


    /**
     * Get the value of idRespuesta
     *
     * @return the value of idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * Set the value of idRespuesta
     *
     * @param idRespuesta new value of idRespuesta
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public String toString() {
        return "Respuestas{" + "idRespuesta=" + idRespuesta + ", FechaR=" + FechaR + ", HoraR=" + HoraR + ", PreguntaR=" + respuestaR + ", codigoPFR=" + codigoPFR + ", idPreguntaFR=" + idPreguntaFR + '}';
    }

}
