package edu.umg.Clase;

public class persona {
    private String nombre;
    private int edad;

    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Persona: " + nombre + " edad= "+edad;
    }
}
