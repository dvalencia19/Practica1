package PRACTICA1;

public class Persona { //si hacemos solo una clase suele ser privado
    private String nom;
    private String dni;

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void canviarDNI(String dni)throws Exception {
        if (this.dni==null){
        this.dni = dni;
    }else{
            throw new Exception("Porfavor 1 solo DNI");
        }
    }
    public String obtenerDades() throws Exception {
        if (this.dni == null || this.nom == null) {
            throw new Exception("NO PUEDES ACCEDER A SUS DATOS PORQUE NO TIENE DNI O NO TIENE NOMBRE.");
        } else {
            return "\n nombre: " + this.nom + "\n DNI: " + this.dni;

        }
    }
}