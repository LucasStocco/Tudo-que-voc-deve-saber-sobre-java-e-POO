import java.util.Iterator;
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Maca");
        list.add("Banana");
        list.add("Laranja");
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruta: " + iterator.next());
        }
    }

//Métodos ùteis

//Clear(): Remove todos os elementos da lista.
//IsEmpty(): Verifica se a lista está vazia.
//IndexOf(object o): Retorna o índice da primeira ocorrência do elemento.
//Set(int index, E element): Substitui o elemento na posição esoecificada.

//(Exemplo em: MethodsArrayList)//
