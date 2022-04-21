package PRACTICA1;

public class Institut {
    private  String  nominst;
    public  Institut() {}
    public void  posarnominst(String nominst) {
        this.nominst = nominst;
    }
    public  String obtenerDades(){
        return obtenerDades() + "tiene el nom de" + this.nominst;
    }
}
