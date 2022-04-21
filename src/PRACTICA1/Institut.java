package PRACTICA1;
import java.util.ArrayList;

public class Institut {
    private String nom1;
    private String nom2;


    public Institut() {
    }

    public void Professor(String nom1) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Roberto");
        cars.add("Luisa");
        cars.add("German");
        cars.add("Eduardo");
    }

    public void Estudiant(String nom2) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Raul");
        cars.add("Manuel");
        cars.add("Felipe");
        cars.add("Andrea");
    }

    public String obtenerDades() {
        return " El Professor se llama: " + this.nom1 + " Y el de Estudiant:  " + this.nom2;
    }
}
