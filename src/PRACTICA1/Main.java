package PRACTICA1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();                                    //cree una persona
        Persona p2 = new Persona();


        p1.canviarNom("Marc");
        String dades = p1.obtenerDades();
        System.out.println(dades);

        p1.canviarNom("Albert");
        dades = p1.obtenerDades();
        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.posarnota(7.00);
        e.canviarNom("Daniel");
        dades = e.obtenerDades();
        System.out.println(dades);


        Professor p = new Professor();
        p.posarsou(1.500);
        p.canviarNom("Raul");
        dades = p.obtenerDades();
        System.out.println(dades);

        ProfessorSubstitut pr = new ProfessorSubstitut();
        pr.posarsou(1.700);
        Date datainicial = new Date(2002, 3 ,12);
        Date  datafi= new Date(2010, 2 ,5);
        pr.posardatafi(datafi);
        pr.posardatainicial(datainicial);
        pr.canviarNom("Juan");
        dades = pr.obtenerDades();
        System.out.println(dades + " inicio en: " + datainicial.getDate() + "/" + datainicial.getMonth() + "/" + datainicial.getYear() + " y termino en: " + datafi.getDate() + "/" + datafi.getMonth() + "/" + datafi.getYear());

        Institut inst = new Institut();
        dades = inst.obtenerDades();
        System.out.println(dades);

    }
}
