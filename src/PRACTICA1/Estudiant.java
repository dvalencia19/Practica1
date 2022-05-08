package PRACTICA1;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona {                 //tener lo de persona
    List<Double> notas = new ArrayList<>();
    private double nota;
    double max = 0;
    double min = 10;
    double mediana = 0;
    double suma = 0;
    public Estudiant() {
    }

    public void posarnota(double nota) throws Exception {
        this.notas.add(nota);

        for (double nummax: notas) {
            if (nummax > max) {
                max = nummax;
            }
        }
         for (double nummin:  notas) {
             if (nummin < min)
             {
                 min = nummin;
             }
         }


        if (nota > 10 | nota < 0) {
            throw new Exception("No se puede, solo superior a 0 y menor de 10");
        } else {
            this.nota = nota;
        }

    }

    public String obtenerDades() throws Exception {
        for (double num:  notas) {
            suma = suma + num;
            mediana= suma / notas.size();

        }

        //me de lo mismo que persona mas la nota
        return "Estudiante: " + super.obtenerDades() + " que tiene nota: " + this.notas + "\n con la nota maxima:" + "[" + max + "]" + " " +
                "con nota minima de:" + "[" + min + "]" +" con mediana de:" + "[" +  mediana + "]" + ")";
    }

}
