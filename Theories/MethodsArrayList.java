public static void main(String[] args) {
    ArrayList <String> list = new ArrayList <String>();
    list.add("Maca");
    list.add("Banana");
    list.add("Laranja");
    System.out.println("Indice de 'Banana': " + list.indexOf("Banana")); //1
    System.out.println("Lista esta vazia? " + list.isEmpty()); //False
    list.clear(); //Limpa a lista
    System.out.println("Lista apos clear: " + list);
}
