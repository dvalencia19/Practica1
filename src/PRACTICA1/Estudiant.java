package PRACTICA1;

public class Estudiant extends Persona {                 //tener lo de persona
    private double nota;
    public Estudiant() {}
        public void posarnota(double nota) {
            this.nota = nota;
        }
        public String obtenerDades(){
        //me de lo mismo que persona mas la nota
         return super.obtenerDades() + " que tiene nota: " + this.nota;
        }
}
