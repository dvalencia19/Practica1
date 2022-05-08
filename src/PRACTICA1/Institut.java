package PRACTICA1;
import java.time.Period;
import java.util.ArrayList;
import  java.util.List;

public class Institut {
    private String nom1;
    List<Persona> personas = new ArrayList<>();
    public void Nominst(String nom1) {
        this.nom1 = nom1;
    }
    //public void afegirProfe(Professor profe ){
        //this.personas.add(profe);

   // }
    //public void afegirEstudiant(Estudiant estudiante){
      //  this.personas.add(estudiante);
    //}
    public void afegirPersona(Persona person){
        this.personas.add(person);
    }


    public void imprimirInformacio() throws  Exception {
        System.out.println(" El Institut es: " + this.nom1 + ":" + "\n ----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Persona p : personas) {
            System.out.println(p.obtenerDades());
        }
    }



}
