package PRACTICA1;
import java.util.Date;

public class ProfessorSubstitut extends Professor {
    private Date datainicial;
    private  Date datafi;
    public ProfessorSubstitut() {}
    public void posardatainicial(Date datainicial){
        this.datainicial = datainicial;
    }
    public void posardatafi(Date datafi){
        this.datafi = datafi;
    }
    public String obtenerDades() throws Exception{
        return  super.obtenerDades() + "\n * con Fecha de trabajo de:" + "\n + del: " + datainicial.getYear() + "/" + datainicial.getMonth() + "/" + datainicial.getDate() + "\n + al: "+ datafi.getYear() + "/" + datafi.getMonth() + "/" + datafi.getDate() ;
    }
    }

