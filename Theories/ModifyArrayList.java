import java.util.ArrayList;
public class ModifyArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Maca");
        list.add("Banana");
        list.add("Laranja");
        System.out.println("Lista antes da remocao: " + list);

        //Remover pelo índice
        list.remove(1); //Remove "Banana"

        //Remover pelo valor
        list.remove("Laranja");
        System.out.println("Lista apos remocoes: " + list);
    }
}
