
import Productos.productosAdmin;
import login.datosUser;
import login.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  productosAdmin bdproductos=new productosAdmin();
        //bdproductos.Registroproductos();
      // datosUser dbuser= new datosUser();
      // dbuser.usuarioDatos();

       login verificacion = new login();
       verificacion.login();


        }
    }
