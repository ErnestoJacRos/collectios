import java.util.ArrayList;
import java.util.List;

public class ejemploArrayLists {
    public static void main(String[] args) {
        /** Tipos principales de Collections
         * 1 LIST - > ArrayLists -> LinkedLists -> Stack
         * 3 QUEUE
         * 4 MAP
         */

        List <Persona> listas = new ArrayList<Persona>();
        listas.add(new Persona(1,"Luis",45));
        listas.add(new Persona(2,"Gabriel",30));
        listas.add(new Persona(3,"Ibra",9));
        listas.add(new Persona(4,"ToodCode",3));

        //for tradicional
        System.out.println("For traducional");
        for (int i = 0; i <listas.size(); i++) {
            System.out.println("lista = " + listas.get(i).getNombre());
        }
        System.out.println("ForEach");
        for (Persona lista: listas) {
            System.out.println("lista = " + lista.getNombre());
        }
        System.out.println("Con fopreach método ");

      listas.forEach(lista ->{
            System.out.println("lista = " + lista.getNombre());
        });





    }
}
