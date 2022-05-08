package PRACTICA1;

public class Professor extends Persona {
    private double sou;
    public Professor() {}
            public void posarsou(double sou)throws Exception{
        if(sou >=3000){
            throw new Exception("No mereces tanto dinero xddd");

        }else {
            this.sou = sou;
        }
    }
    public String obtenerDades() throws Exception{
        return "Profesor: " + super.obtenerDades() + " (que tiene un sueldo: " + this.sou + ")";
    }
}
