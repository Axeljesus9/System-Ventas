package Productos;

public class productosRegistros {

    private String nombreProducto;
    private float precioProducto;
    private String categoria;

    public productosRegistros(String nameProducto, float costProducto, String catego){
        this.nombreProducto = nameProducto;
        this.precioProducto = costProducto;
        this.categoria = catego;
    }

    /*public int getCart() {
        return cart;
    }

    public void setCart(int cart) {
        this.cart = cart;
    }*/

    public String getCategorias() {
        return categoria;
    }

    public void setCategorias(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getNombre_Producto() {
        return nombreProducto;
    }

    public void setNombre_Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
