package PRACTICA1;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona {                 //tener lo de persona
    List<Double> notas = new ArrayList<>();
    private double nota;
    public Estudiant() {}
        public void posarnota(double nota)  throws Exception{
        this.notas.add(nota);
        double max = 10;
        double min = 0;
        for (i=1; i <= this.nota; i++){
            SumaNotas = SumaNotas + nota;
            if(nota > max ){
                max=nota;
            }
            if(nota < min){
                min=nota;
            }
        }
            if (nota > 10 | nota < 0) {
                throw new Exception("No se puede, solo superior a 0 y menor de 10");
            } else {
                this.nota = nota;
            }
        }
        public String obtenerDades() throws Exception{
        //me de lo mismo que persona mas la nota
         return super.obtenerDades() + " que tiene nota: " + this.nota + ")";
        }
}
