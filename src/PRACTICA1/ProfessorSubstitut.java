package PRACTICA1;

public class ProfessorSubstitut extends Professor {
    private String datainicial;
    private  String datafi;
    public ProfessorSubstitut() {}
    public void posardatainicial(String datainicial){
        this.datainicial = datainicial;
    }
    public void posardatafi(String datafi){
        this.datafi = datafi;
    }
    public String obtenerDades(){
        return  super.obtenerDades() + " inicio en " + this.datainicial + " termino en " + this.datafi;
    }
    }

