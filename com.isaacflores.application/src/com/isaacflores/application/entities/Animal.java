package com.isaacflores.application.entities;

/**Superclase de los animales*/
abstract public class Animal {
    // Atributos de la pagina

    //atributos comunes
    private String tamanio;
    private String color;
    private String sexo;


    /**Constructor de la clase Animal
    *
     * @param tamanio tamaño del animal
     * @param sexo sexo del animal
     * @param color color del animal
     */
    public Animal(String tamanio, String sexo, String color) {
        this.setSexo(sexo);
        this.setTamanio(tamanio);
        this.setColor(color);
    }
    /**constructor vacio de la clase animal*/
    public Animal() {

    }


    /**Getter de sexo
     * @return sexo del animal
     */
    public String getSexo() {
        return sexo;
    }

    /**Setter de sexo
     * @param sexo sexo del animal
     */

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    /**Getter de tamanio
     *
     * @return tamanio del animal
     */
    public String getTamanio() {
        return tamanio;
    }

    /**Setter de tamanio
     *
     * @param tamaño tamaño del animal
     */
    public void setTamanio(String tamaño) {
        this.tamanio = tamaño;
    }

    /**Getter de color
     *
     * @return color del animal
     */
    public String getColor() {
        return color;
    }

    /**Setter de color
     *
     * @param color color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
}
