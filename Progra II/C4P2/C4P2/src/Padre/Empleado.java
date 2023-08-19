package Padre;

public class Empleado {
    private String nombre;
    private String sueldo;

    public Empleado(String nombre, String sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetallles(){
        return "nombre: "+this.getNombre()+" sueldo: "+this.getSueldo();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Homero")){
            this.nombre ="No homeros";
        } else {
            this.nombre = nombre;
        }

    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}

