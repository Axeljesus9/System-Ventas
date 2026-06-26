package login;

import java.util.Scanner;

public class login {
    public void login(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("INGRESA CORREO");
        String correo=scanner.nextLine();
        System.out.println("INGRESA CONTRASEÑA");
        String password=scanner.nextLine();

        loginRegistro datosLogin = new loginRegistro(correo,password);
        loginDd verificacion= new loginDd();
        verificacion.envioDatos(datosLogin);



    }
}
