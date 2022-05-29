/** contiene una representación de los datos que maneja el sistema, su lógica de negocio, y sus mecanismos de persistencia.*/
module com.isaacflores.application {
    requires java.desktop;
    requires java.sql;
    exports com.isaacflores.application.db;
    exports com.isaacflores.application.entities;
}