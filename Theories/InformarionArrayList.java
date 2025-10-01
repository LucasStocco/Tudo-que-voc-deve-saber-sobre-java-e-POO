    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Maca");
        list.add("Banana");
        list.add("Laranja");
        System.out.println("Tamanho da lista: " + list.size()); //3
        System.out.println("Contem 'Banana'? " + list.contains("Banana")); //True
        System.out.println("Contem 'Uva'? " + list.contains("Uva"));
    }     

//Size():
//Retorna o número de elementos na ArrayList.

//Contains(Object o):
//Verifica se um elemento específico existe na lista.
