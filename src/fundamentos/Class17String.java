package fundamentos;

public class Class17String {

    public static void main(String[] args) {
        //DECLARAMOS UN STRING
        String texto = "Curso de Apps Java";
        System.out.println("Longitud: " + texto.length());
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("indexOf('a'): " + texto.indexOf("a"));
        System.out.println("indexOf('a', 16): " + texto.indexOf("a", 16));
        System.out.println("lastIndexOf('a'): " + texto.lastIndexOf("a"));
        System.out.println("lastIndexOf('a', 16): " + texto.lastIndexOf("a", 16));
        System.out.println("indexOf('z'): " + texto.indexOf("z"));
        System.out.println("startsWith('Cur'): " + texto.startsWith("Cur"));
        System.out.println("endsWith('java'): " + texto.endsWith("java"));
        System.out.println("substring(2, 4): " + texto.substring(2, 4));
        System.out.println("substring(10): " + texto.substring(10));
        System.out.println("contains('de'): " + texto.contains("de"));
        //LOS METODOS NO MODIFICAN EL OBJETO
        texto.toUpperCase();
        //LA UNICA FORMA DE MODIFICAR EL OBJETO ES CON IGUAL
        texto = texto.toUpperCase();
        System.out.println(texto);
        System.out.println("charAt(9): " + texto.charAt(9));
        //startsWith ( ??? )
        //equalsIgnoreCase ( ?? )
        System.out.println("equals('curso de apps java'): " + texto.equals("curso de apps java"));
        System.out.println("equalsIgnoreCase( 'curso de apps java'): "
                + texto.equalsIgnoreCase("curso de apps java"));
        String dato = "curso";
        //QUEREMOS SABER SI EL TEXTO COMIENZA CON curso
        //PERO EL TEXTO ESTA EN MAYUSCULAS
        if (texto.toLowerCase().startsWith(dato) == true) {
            System.out.println("El texto comienza con curso");
        }
        //RECORRER TODOS LOS ELEMENTOS DE UN STRING
        //MOSTRAMOS LETRA A LETRA CADA CARACTER
        //DONDE COMIENZA LA CADENA (POSICION)?: 0
        //DONDE TERMINA LA CADENA (INDICE): length() - 1
        for (int i = 0; i < texto.length(); i++) {
            //COMO RECUPERO UNA LETRA DEL TEXTO POR SU INDICE??
            //charAt(indice)
            char letra = texto.charAt(i);
            System.out.println("Posicion: " + i + ", Letra: " + letra);
        }
    }
}
