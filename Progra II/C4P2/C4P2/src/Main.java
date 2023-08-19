
import Hijo.ScrumMaster;
import Padre.Empleado;

public class Main {
    public static  void imprime(Empleado emple ){
         System.out.println("Objeto.obtenerDetallles() = " + emple.obtenerDetallles());
    }
    public static void determinartipo(Empleado emple){
        if (emple instanceof ScrumMaster){
            System.out.println("Esto vine de ScrumMaster");
        } else if (emple instanceof Empleado){
            System.out.println("Esto viene de Empleado");
        } else if (emple instanceof Object){
            System.out.println("Esto es cualquier cos");
        }
    }
    public static void main(String[] args) {
        Empleado em = new Empleado("Juan", "3500");

        ScrumMaster sm = new ScrumMaster("juan", "3500", "Sistemas");

        System.out.println(em.toString());

        }
    }
