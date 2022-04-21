package PRACTICA1;

public class Persona {              //si hacemos solo una clase suele ser privado
    public void canviarNom(String nom) {
        this.nom = nom;
    }
    private String nom;
    private String dni;
    public Persona(){
       // System.out.println("Hola");
    }

    public String obtenerDades(){
        return " persona que es diu " + this.nom;
    }
}
