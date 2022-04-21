package PRACTICA1;

public class Professor extends Persona {
    private double sou;
    public Professor() {}
            public void posarsou(double sou){
        this.sou = sou;
    }
    public String obtenerDades(){
        return super.obtenerDades() + " que tiene un sueldo: " + this.sou;
    }
}
