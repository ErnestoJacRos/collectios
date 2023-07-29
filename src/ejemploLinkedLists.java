import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ejemploLinkedLists {
    public static void main(String[] args) {
        /** Tipos principales de Collections
         * 1 LIST - > ArrayLists -> LinkedLists -> Stack
         * 3 QUEUE
         * 4 MAP
         */

        List <Persona> listas = new LinkedList<Persona>();
        //agregar al final de la lista
        listas.add(new Persona(1,"Luis",45));
        listas.add(new Persona(2,"Gabriel",30));
        listas.add(new Persona(3,"Ibra",9));
        listas.add(new Persona(4,"ToodCode",3));

        //Agregar al inicio de la lista
        listas.add(0, new Persona(5,"Karen",78));
        System.out.println("---------------ForeEach---------------------");
        listas.forEach(lista-> System.out.println("lista.getNombre() = " + lista.getNombre()));






    }
}
