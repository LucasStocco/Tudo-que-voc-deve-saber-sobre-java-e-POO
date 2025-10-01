import java.util.ArrayList;
public class AcessingArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Maca");
        list.add("Banana");
        list.add("Laranja");
        System.out.println("Primeiro elento: " + list.get(0)); //Maçã
        System.out.println("Segunfo elemento: " + list.get(1)); //Banana
    }
}
