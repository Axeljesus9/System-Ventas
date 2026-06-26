package login;

import java.util.Scanner;

public class datosUser {

    public void usuarioDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("******BIENVENIDO USUARIO******");
        System.out.println();
        System.out.println("******COLOCA TU NOMBRE******");
        String name= sc.nextLine();
        System.out.println("******COLOCA TU APELLIDO******");
        String last=sc.nextLine();
        System.out.println("******COLOCA TU FECHA DE NACIMIENTO******");
        String date=sc.nextLine();
        System.out.println("******COLOCA TU CORREO******");
        String email=sc.nextLine();
        System.out.println("******COLOCA TU PASSWORD******");
        String pass=sc.nextLine();

        usuarioRegistro datos= new usuarioRegistro(name,last,date,email,pass);

        registro guardado= new registro();
        guardado.registroUser(datos);

        System.out.println("============================================");


    }
}
