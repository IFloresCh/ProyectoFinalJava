package com.isaacflores.application.entities;

/** Clase que representa una raya*/
public class Rayas extends ProShark {

    private String numberOfFins;

    /**Constructor de rayas
     * @param especie especie de la rayas
     * @param habitat habitat de la rayas
     * @param profundidad profundidad de la observacion
     * @param tiempoNavegacion tiempo de navegacion al lugar de observacion
     * @param nubosidad nubosidad del lugar
     * @param horaDeLlegada hora de llegada al lugar de observacion
     * @param numeroEmbarcaciones numero de embarcaciones
     * @param temperatura temperatura del lugar
     * @param cebo cebo de la rayas
     * @param sexo sexo de la rayas
     * @param parasitos parasitos de la rayas
     * @param anzuelos presenta anzuelos?
     * @param numeroAnzuelos numero de anzuelos usados
     */


    public Rayas(String especie, String habitat, String profundidad, String tiempoNavegacion, String nubosidad, String horaDeLlegada, String numeroEmbarcaciones, String temperatura, String cebo, String sexo, String parasitos, String anzuelos, String numeroAnzuelos) {
        super(especie, habitat, profundidad, tiempoNavegacion, nubosidad, horaDeLlegada, numeroEmbarcaciones, temperatura, cebo, sexo, parasitos, anzuelos, numeroAnzuelos);
    }

    /**Constructor de rayas vacio*/
    public Rayas() {

    }

    /**Getter de numero de aletas
     *
     * @return numero de aletas
     */
    public String getNumberOfFins() {
        return numberOfFins;
    }

    /**Setter de numero de aletas
     *
     * @param numberOfFins numero de aletas
     */
    public void setNumberOfFins(String numberOfFins) {
        this.numberOfFins = numberOfFins;
    }
}
