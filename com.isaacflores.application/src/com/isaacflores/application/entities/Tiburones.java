package com.isaacflores.application.entities;

/** Clase que representa un tiburon*/
public class Tiburones extends ProShark{

    private String numberOfFins;

    /**Class Constructor

     * @param especie especie del tiburon
     * @param habitat habitat del tiburon
     * @param profundidad   profundidad de la observacion
     * @param tiempoNavegacion  tiempo de navegacion al lugar de observación
     * @param nubosidad     nubosidad del lugar
     * @param horaDeLlegada hora de llegada al lugar de observación
     * @param numeroEmbarcaciones numero de embarcaciones
     * @param temperatura  temperatura del lugar
     * @param cebo cebo del tiburon
     * @param sexo sexo del tiburon
     * @param parasitos parasitos del tiburon
     * @param anzuelos presenta anzuelos?
     * @param numeroAnzuelos numero de anzuelos usados
     */

    public Tiburones(String especie, String habitat, String profundidad, String tiempoNavegacion, String nubosidad, String horaDeLlegada, String numeroEmbarcaciones, String temperatura, String cebo, String sexo, String parasitos, String anzuelos, String numeroAnzuelos) {
        super(especie, habitat, profundidad, tiempoNavegacion, nubosidad, horaDeLlegada, numeroEmbarcaciones, temperatura, cebo, sexo, parasitos, anzuelos, numeroAnzuelos);
    }
    /**Empty class constructor*/
    public Tiburones() {
        super();
    }

    /**Getter de numero de aletas
     *
     * @return retorna el numero de aletas
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



