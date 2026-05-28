public class TiposDatos {
    static void main(String[] args) {
        // Tipos de datos en java

        // Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147383647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321002345567L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);
        
        // Punto flotante (valor default 0.0)
        float tipoFloat = 3.14F; // F o f para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar que es tipo float (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter ('\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        // Tipos object (referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Thiago";
        System.out.println("nombre = " + nombre);

    }
}
