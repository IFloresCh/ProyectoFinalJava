package com.isaacflores.application.db;

/**Clase que representa la conexión a la base de datos.*/
public class Database {

    private String url;
    private String user;
    private String pass;

    /**Constructor de la clase Database*/
    public Database() {

        this.url = "jdbc:mysql://mysql-iflores.alwaysdata.net/iflores_observatory";
        this.user = "iflores_pg";
        this.pass = "wev6pimwmduULgs";
    }

    /**Obtiene la url de la base de datos
     *
     * @return url de la base de datos
     */
    public String getUrl() {
        return url;
    }

    /**Obtiene el usuario de la base de datos
     *
     * @return usuario de la base de datos
     */
    public String getUser() {
        return user;
    }

    /**Obtiene la contraseña de la base de datos
     *
     * @return contraseña de la base de datos
     */
    public String getPass() {
        return pass;
    }


}
