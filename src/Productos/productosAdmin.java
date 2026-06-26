package Productos;

import java.util.Scanner;


public class productosAdmin {
        private boolean salir=false;
        private int optioncat;
        private int cantidad;
        public    String categoria;
        public   String productoSeleccionado;
        public float costo;


        public void Registroproductos() {
            Scanner scPruductos = new Scanner(System.in);
            //    while (!salir) {
            System.out.println("BIENVENIDO USUARIO/ADMIN ");
            System.out.println("\t");
            System.out.printf("""
                    COLOQUE LOS PRODUCTOS QUE QUIERE SUBIR AL SISTEMA
                    
                    RECUERDA SOLO PUEDES SUBIR 5 PRODUCTOS
                    
                    CUANTOS PRODUCTOS NECESITAS SUBIR? 
                    """);
            cantidad = Integer.parseInt(scPruductos.nextLine());
            if (cantidad>0 && cantidad<=5) {
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("La cantidad de los productosAdmin son"+(i+1)+"----");

                    System.out.printf("""
                                    QUE CATEGORIA ES EL PRODUCTO

                                    1- COMIDA
                                    2- ELECTRODOMESTICOS
                                    3- JUEGOS DE MESA
                                    4- DEPORTES
                                    """);
                     optioncat= Integer.parseInt(scPruductos.nextLine());
                     categoria=switch (optioncat){
                        case 1 -> "COMIDA";
                        case 2 -> "ELECTRODOMESTICOS";
                        case 3 -> "JUEGOS DE MESA";
                        case 4 -> "DEPORTES";
                        default -> "GENERAL";
                    };

                    System.out.println("Nombre del producto: ");
                    productoSeleccionado=scPruductos.nextLine();

                     System.out.println("Precio del producto: ");
                     costo =Float.parseFloat(scPruductos.nextLine());

                    productosRegistros bdpro = new productosRegistros(productoSeleccionado,costo,categoria);

                    bdProductos bdProducto = new bdProductos();
                    bdProducto.conectionProductos(bdpro);
                    System.out.println("Producto " + (i + 1) + " subido con éxito.");

                }


                //}

            }else{
                System.out.println("error al subir al sistema");
            }

        }
}
