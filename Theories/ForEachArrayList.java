public static void main(String[] args) {
    ArrayList <String> list = new ArrayList <String>();
    list.add("Maca");
    list.add("Banana");
    list.add("Laranja");
    for (String fruit : list) {
        System.out.println("Fruta: " + fruit);
    }
}