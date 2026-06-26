package login;
import BaseDeDatos.baseDeDatos;
import login.registro;

public class usuarioRegistro {
        private String name;
        private String lastname;
        private String correo;
        private String password;
        private String date;

        public usuarioRegistro(String name, String lastname,String date, String correo, String pass){
            this.name=name;
            this.lastname=lastname;
            this.date=date;
            this.correo=correo;
            this.password=pass;


        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}











