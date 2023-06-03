/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

/**
 *
 * @author martin
 */
public class Conexion {

    public static java.sql.Connection mySQL(String baseDatos, String username, String password) {
        java.sql.Connection con = null;
        try {

            // 1.1) Cargamos el driver JDBC que vayamos a usar
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 1.2) Establecemos una conexión con nuestra base de datos
            //El objeto Properties hace que salgan tildes y eñes, también podemos añadir el usuario y contraseña
            java.util.Properties props = new java.util.Properties();
            props.put("charSet", "iso-8859-1");
            props.put("user", username);
            props.put("password", password);
            //conectamos con la base de datos
            String url = "jdbc:mysql://localhost:3306/" + baseDatos;
            con = (java.sql.Connection) java.sql.DriverManager.getConnection(url, props);
            return con;
        } catch (java.sql.SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: "
                    + e.toString());
            return null;
        }
    }
}
