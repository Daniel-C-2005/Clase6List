package Hijo;

import Padre.Empleado;

public class ScrumMaster extends Empleado {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ScrumMaster(String nombre, String sueldo,String depto) {
        super(nombre, sueldo);
        this.departamento = depto;

    }
    @Override
    public String obtenerDetallles(){
        return "Desde Hijo Nombre: "+this.getNombre()+" sueldo: "+this.getSueldo()+" direccion: "+this.getDepartamento();
    }
}
