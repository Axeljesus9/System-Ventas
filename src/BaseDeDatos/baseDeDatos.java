package BaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class baseDeDatos {
    //al colocarlo de esta manera estamos usando separacion de responsabilidades

    private  String driver="com.mysql.cj.jdbc.Driver";//esto es libreria de MYSQL

    private  String database="login";//esto sirve para mencionar que base de datos estamos usando

    private  String hostname="127.0.0.1";//es la direccion de la computadora

    private  String port="3306";//con el puerto java se comunica con el base de datos

    private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
            "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";//es la ruta de nuestra base de datos ( Y DESACTIVAMOS EL SSL CON ?useSSL=false)

    private  String usuario="root";

    private  String passUser="1322134312";

    public Connection conectarMySQL(){
        Connection conn=null;
        try{
        Class.forName(driver);
        conn=DriverManager.getConnection(url, usuario,passUser);

        }catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        return conn;
    }





}
