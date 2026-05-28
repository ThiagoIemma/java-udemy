public class RetoReservaHoteles {
    static void main(String[] args) {
        System.out.println("*** SISTEMA DE RESERVA DE HOTELES ***");

        // Definimos variables
        var nombreCliente = "Cleopatra";
        var diasEstancia = 7;
        var tarifaDiaria = 29.99F;
        var hasVistaAlMar = false;

        System.out.println("----------------------------------------");

        // Imprimimos variables
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("hasVistaAlMar = " + hasVistaAlMar);

        System.out.println("----------------------------------------");

        System.out.println("Cambios en la reserva:");

        System.out.println("----------------------------------------");

        // Cambiamos algunas variables
        diasEstancia = 14;
        hasVistaAlMar = true;

        // Imprimimos cambios
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("hasVistaAlMar = " + hasVistaAlMar);

    }
}
