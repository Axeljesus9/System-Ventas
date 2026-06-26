package login;
import BaseDeDatos.baseDeDatos;
import login.usuarioRegistro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
public class registro {


      public void registroUser(usuarioRegistro usuarioRegistro){
             baseDeDatos bd= new baseDeDatos();
             String sql="INSERT INTO usuarios (name,lastname,fechaNacimiento,correo,password) VALUES(?,?,?,?,?)";

             try (Connection conn= bd.conectarMySQL();
                  PreparedStatement ps = conn.prepareStatement(sql)){
                     ps.setString(1,usuarioRegistro.getName());
                     ps.setString(2,usuarioRegistro.getLastname());
                     ps.setString(3,usuarioRegistro.getDate());
                     ps.setString(4,usuarioRegistro.getCorreo());
                     ps.setString(5,usuarioRegistro.getPassword());
                     ps.executeUpdate();
                    System.out.println("registrado el usuario");

             }catch (SQLException e){
                    e.printStackTrace();
             }


          }
 }












