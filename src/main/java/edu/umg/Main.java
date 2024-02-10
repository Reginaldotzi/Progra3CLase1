package edu.umg;
import edu.umg.Clase.TablaPronostico;
import edu.umg.Clase.persona;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TablaPronostico tabla = new TablaPronostico();
        tabla.calculos();
    }

      /* persona[] personas = new persona[3];

        /*
        // asignar el objeto persona
        personas[0] = new persona("Juan",20);
        personas[1] = new persona("Maria",20);
        personas[02] = new persona("Juan",20);


        for (persona persona : personas) {
            System.out.println(persona);
        }

        //Ahora con matriz
        persona[][] matrix = new persona[2][2];
        matrix[0][0] = new persona("Juan",20);
        matrix[0][1] = new persona("Maria",26);
        matrix[1][0] = new persona("Pedro",29);
        matrix[1][1] = new persona("Carlos",27);

        for (persona[]fila:matrix){
            for (persona persona : fila){
                System.out.println(persona);
            }
        }
    }*/

}