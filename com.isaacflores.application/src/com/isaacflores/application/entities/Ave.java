package com.isaacflores.application.entities;
/** Clase que representa una ave*/
public class Ave extends Animal {
    private String especie;
    private String cantidad;
    private String altura;

    /** Contructor de la clase ave extiende animal
     *
     * @param tamanio tamaño del ave
     * @param sexo sexo del ave
     * @param color color del ave
     * @param especie especie del ave
     * @param cantidad cantidad de aves
     * @param altura altura de avistamiento
     */
    public Ave(String tamanio, String sexo, String color, String especie, String cantidad, String altura) {
        super(tamanio, sexo, color);
        this.especie = especie;
        this.cantidad = cantidad;
        this.altura = altura;
    }

    /** Contructor de la clase ave
     *
     * @param especie especie del ave
     * @param cantidad cantidad de aves
     * @param altura altura de avistamiento
     */
    public Ave(String especie, String cantidad, String altura) {
        this.especie = especie;
        this.cantidad = cantidad;
        this.altura = altura;
    }
/**Constructor vacio ave*/
    public Ave() {

    }

    /**Getter de especie
     *
     * @return especie de la ave
     */
    public String getEspecie() {
        return especie;
    }

    /**Setter de especie
     *
     * @param especie especie de la ave
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**Getter de cantidad
     *
     * @return cantidad de aves
     */
    public String getCantidad() {
        return cantidad;
    }

    /**Setter de cantidad
     *
     * @param cantidad cantidad de aves
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**Getter de altura
     *
     * @return altura de la observacion
     */
    public String getAltura() {
        return altura;
    }

    /**Setter de altura
     *
     * @param altura altura de la observacion
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }
}
