import java.util.*;
public class LoopForEachArrayList {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList <String>();
        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Laranja");
        for (String fruit : fruits) {
            System.out.println("Fruta: " + fruit);
        }
    }
}
