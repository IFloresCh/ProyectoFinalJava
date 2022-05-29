/** actúa como intermediario entre el Modelo y la Vista, gestionando el flujo de información entre ellos y las transformaciones para adaptar los datos a las necesidades de cada uno.*/
module com.isaacflores.controller {
    requires com.isaacflores.application;
    requires java.desktop;
    requires java.sql;
    requires com.isaacflores.view;
    exports com.isaacflores.controller.ui;
}