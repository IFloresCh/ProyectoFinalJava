package com.isaacflores.application.entities;
/** Clase que representa otro animal*/
public class Otro extends Animal {
    private String cantidad;
    private String especie;

    /** Contructor de la clase otro extiende animal
     *
     * @param tamanio tamaño del otro
     * @param sexo sexo del otro
     * @param color color del otro
     * @param cantidad cantidad de otro
     * @param especie especie del otro
     */
    public Otro(String tamanio, String sexo, String color, String cantidad, String especie) {
        super(tamanio, sexo, color);
        this.cantidad = cantidad;
        this.especie = especie;
    }

    /** Contructor de la clase otro
     *
     * @param cantidad cantidad de otro
     * @param especie especie de otro
     */
    public Otro(String cantidad, String especie) {
        this.cantidad = cantidad;
        this.especie = especie;
    }
/**Constructor vacio otro*/
    public Otro() {

    }

    /**Getter de cantidad
     *
     * @return cantidad de animales
     */
    public String getCantidad() {
        return cantidad;
    }

    /**Setter de cantidad
     *
     * @param cantidad cantidad de animales
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /** Getter de especie
     *
     * @return especie de animales
     */
    public String getEspecie() {
        return especie;
    }

    /** Setter de especie
     *
     * @param especie especie de animales
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
