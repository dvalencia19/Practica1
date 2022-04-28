package PRACTICA1;

public class Persona { //si hacemos solo una clase suele ser privado
    private String nom;
    private String dni;
    public void canviarNom(String nom) {
        this.nom = nom;
    }
    public void canviarDNI(String dni) {
        this.dni = dni;
    }

    public Persona(){
       // System.out.println("Hola");
    }

    public String obtenerDades(){
        return " persona que es diu: " + this.nom + " Con el DNI: " + this.dni;
    }
}
