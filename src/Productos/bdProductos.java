package Productos;
import BaseDeDatos.baseDeDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class bdProductos {

    public void conectionProductos(productosRegistros productosRegistros){
        baseDeDatos bdProduct=new baseDeDatos();
        String sqlProductos="INSERT INTO productos(nombre_Producto,categorias,precio) VALUES(?,?,?)";

        try(Connection cnn= bdProduct.conectarMySQL();
            PreparedStatement psProductos = cnn.prepareStatement(sqlProductos)) {
            psProductos.setString(1,productosRegistros.getNombre_Producto());
            psProductos.setString(2,productosRegistros.getCategorias());
            psProductos.setFloat(3,productosRegistros.getPrecioProducto());
            psProductos.executeUpdate();
            System.out.println("datos mandados correctamente");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    }

