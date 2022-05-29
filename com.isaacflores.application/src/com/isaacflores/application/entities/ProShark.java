package com.isaacflores.application.entities;

/** Clase que contiene los atributos Proshark */

abstract public class ProShark extends Animal{

    private String especie;
    private String habitat;
    private String profundidad;
    private String tiempoNavegacion;
    private String nubosidad;
    private String horaDeLlegada;
    private String numeroEmbarcaciones;
    private String temperatura;
    private String cebo;

    private String parasitos;
    private String anzuelos;
    private String numeroAnzuelos;

    /**Constructor de ProShark
     * @param especie especie del proshark
     * @param habitat habitat del proshark
     * @param profundidad profundidad de la observacion
     * @param tiempoNavegacion tiempo de navegacion al lugar de observacion
     * @param nubosidad nubosidad del lugar
     * @param horaDeLlegada hora de llegada al lugar de observacion
     * @param numeroEmbarcaciones numero de embarcaciones
     * @param temperatura temperatura del lugar
     * @param cebo cebo del proshark
     * @param sexo sexo del proshark
     * @param parasitos parasitos del proshark
     * @param anzuelos presenta anzuelos?
     * @param numeroAnzuelos numero de anzuelos usados
     */

    public ProShark(String especie, String habitat, String profundidad, String tiempoNavegacion, String nubosidad, String horaDeLlegada, String numeroEmbarcaciones, String temperatura, String cebo, String sexo, String parasitos, String anzuelos, String numeroAnzuelos) {
        this.especie = especie;
        this.habitat = habitat;
        this.profundidad = profundidad;
        this.tiempoNavegacion = tiempoNavegacion;
        this.nubosidad = nubosidad;
        this.horaDeLlegada = horaDeLlegada;
        this.numeroEmbarcaciones = numeroEmbarcaciones;
        this.temperatura = temperatura;
        this.cebo = cebo;
        this.parasitos = parasitos;
        this.anzuelos = anzuelos;
        this.numeroAnzuelos = numeroAnzuelos;
    }
/**Constructor de ProShark vacio*/
    public ProShark() {

    }

    /**Getter de especie
     *
     * @return getter de la especie
     */
    public String getEspecie() {
        return especie;
    }

    /**Setter de especie
     *
     * @param especie setter de la especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**Getter de habitat
     *
     * @return getter del habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**Setter de habitat
     *
     * @param habitat setter de habitat
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**Getter de profundidad
     *
     * @return getter de la profundidad
     */
    public String getProfundidad() {
        return profundidad;
    }

    /**Setter de profundidad
     *
     * @param profundidad setter de profundidad
     */
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    /**Getter de tiempo de navegacion
     *
     * @return  getter del tiempo de navegacion
     */
    public String getTiempoNavegacion() {
        return tiempoNavegacion;
    }

    /**Setter de tiempo de navegacion
     *
     * @param tiempoNavegacion  setter del tiempo de navegacion
     */
    public void setTiempoNavegacion(String tiempoNavegacion) {
        this.tiempoNavegacion = tiempoNavegacion;
    }

    /**Getter de nubosidad
     *
     * @return getter de la nubosidad
     */
    public String getNubosidad() {
        return nubosidad;
    }

    /**Setter de nubosidad
     *
     * @param nubosidad setter de la nubosidad
     */
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    /**Getter de hora de llegada
     *
     * @return getter de la hora de llegada
     */
    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    /**Setter de hora de llegada
     *
     * @param horaDeLlegada setter de la hora de llegada
     */
    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    /**Getter de numero de embarcaciones
     *
     * @return getter del numero de embarcaciones
     */
    public String getNumeroEmbarcaciones() {
        return numeroEmbarcaciones;
    }

    /**Setter de numero de embarcaciones
     *
     * @param numeroEmbarcaciones setter del numero de embarcaciones
     */
    public void setNumeroEmbarcaciones(String numeroEmbarcaciones) {
        this.numeroEmbarcaciones = numeroEmbarcaciones;
    }

    /**Getter de temperatura
     *
     * @return retorna la temperatura
     */
    public String getTemperatura() {
        return temperatura;
    }

    /**Setter de temperatura
     *
     * @param temperatura setter de la temperatura
     */
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    /**Getter de cebo
     *
     * @return retorna el cebo usado
     */
    public String getCebo() {
        return cebo;
    }

    /**Setter de cebo
     *
     * @param cebo  setter del cebo usado
     */
    public void setCebo(String cebo) {
        this.cebo = cebo;
    }

    /**Getter de parasitos
     *
     * @return retorna si tiene parasitos o no
     */
    public String getParasitos() {
        return parasitos;
    }

    /**Setter de parasitos
     *
     * @param parasitos setter de si tiene parasitos o no
     */
    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    }

    /**Getter de anzuelos
     *
     * @return anzuelos
     */
    public String getAnzuelos() {
        return anzuelos;
    }

    /** Setter de anzuelos
     *
     * @param anzuelos setter de anzuelos
     */
    public void setAnzuelos(String anzuelos) {
        this.anzuelos = anzuelos;
    }

    /**Getter de numero de anzuelos
     * @return numero de anzuelos
     */

    public String getNumeroAnzuelos() {
        return numeroAnzuelos;
    }

    /**Setter de numero de anzuelos
     *
     * @param numeroAnzuelos setter del numero de anzuelos
     */
    public void setNumeroAnzuelos(String numeroAnzuelos) {
        this.numeroAnzuelos = numeroAnzuelos;
    }
}
