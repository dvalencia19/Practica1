package PRACTICA1;

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
        pr.posardatainicial("3/12/2002");
        pr.posardatafi("12/3/2010");
        pr.canviarNom("Juan");
        dades = pr.obtenerDades();
        System.out.println(dades);

        Institut inst = new Institut();




        //System.out.println(p1.nom);
        //System.out.println(p1.dni);
    }
}
