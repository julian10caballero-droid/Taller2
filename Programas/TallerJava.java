package lg; 

public class TallerJava {
    public static void main(String[] args) {
        
        
        byte edad = 20;
        short año = 2026;
        int idUsuario = 5500;
        long poblacionMundial = 8000000000L; 
        int semestre = 1;
        
        
        float precioPan = 1.50f;             
        double pi = 3.14159265359;
        double temperatura = 25.4;
        double notaFinal = 4.8;
        double estatura = 1.75;
        
        // Lógicos (boolean)
        boolean esEstudiante = true;
        boolean tieneClave = false;
        boolean esDia = true;
        boolean claseTerminada = false;
        
        // Caracteres (char)
        char inicial = 'G';
        char grupo = 'A';
        char seccion = '1';
        
        // Cadenas de Texto (String)
        String nombre = "Mateo";
        String ciudad = "Medellin";
        String curso = "Java";

        
        idUsuario = año;               
        temperatura = precioPan;       
        nombre = ciudad;                
        notaFinal = estatura;           
        semestre = edad;                

        edad = 25;
        año = 2027;
        poblacionMundial = 9000000000L;
        precioPan = 2.10f;
        pi = 3.14;
        estatura = 1.80;
        esEstudiante = false;
        tieneClave = true;
        esDia = false;
        claseTerminada = true;
        inicial = 'Z';
        grupo = 'B';
        seccion = '2';
        ciudad = "Bogota";
        curso = "Programacion II";

        
        System.out.println("¡Taller ejecutado correctamente!");
        System.out.println(inicial + " " +grupo + " " +seccion+ " " +ciudad+ " " +curso);
    }
}