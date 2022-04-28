package PRACTICA1;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Institut ins = new Institut();
        ins.Nominst("La Guineueta");

        Professor profe1 = new Professor();
        profe1.canviarNom("Marc");
        profe1.canviarDNI("123445F");
        ins.afegirProfe(profe1);

        ProfessorSubstitut pr = new ProfessorSubstitut();
        pr.canviarNom("Laura");
        pr.canviarDNI("43545245Y");
        Date datainicial = new Date(2021, 11, 1);
        Date datafi = new Date(2022, 6, 30);
        pr.posardatafi(datafi);
        pr.posardatainicial(datainicial);

        ins.afegirProfe(pr);

        Estudiant e= new Estudiant();
        e.canviarNom("Joan");
        e.canviarDNI("131231A");
        e.posarnota(7.5);
        ins.afegirEstudiant(e);

        ins.imprimirInformacio();
    }
}
