
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import BaseDeDatos.baseDeDatos;
public class loginDd {

    public void envioDatos(loginRegistro loginRegistro){

        baseDeDatos bdValidacion = new baseDeDatos();
        String sqlValidacion="SELECT * FROM usuarios WHERE correo=(?) AND password=(?)";

        try(Connection connection = bdValidacion.conectarMySQL();
            PreparedStatement ps =connection.prepareStatement(sqlValidacion)){
            ps.setString(1,loginRegistro.getCorreo());
            ps.setString(2,loginRegistro.getPassword());
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("LOGIN EXITOSO");
            }else{
                System.out.println("CORREO O PASSWORD INCORRECTOS");
            }
        }catch (SQLException e){
            e.printStackTrace();

        }


    }



}
