public class DetalleProductoTienda {
    static void main(String[] args) {

        // Detalle del producto
        System.out.println("*** Tienda en linea ***");
        String nombreProducto = "Zapatillas";
        double precioProducto = 180.50;
        int cantidadDisponible = 200;
        boolean isDisponibleVenta = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponibleVenta = " + isDisponibleVenta);

        System.out.println("------------------------------");

        // Modificacion de los valores
        nombreProducto = "Buzos";
        precioProducto = 95.30;
        cantidadDisponible = 120;
        isDisponibleVenta = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponibleVenta = " + isDisponibleVenta);
    }
}
