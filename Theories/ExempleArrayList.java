import java.util.ArrayList;
public class ExempleArrayList {
    public static void main(String[] args) {

        //Criando um ArrayList vazio
        ArrayList <String> list = new ArrayList <String>();

        //Adicionando elementos
        list.add("Maca");
        list.add("Banana");
        list.add("Laranja");
        System.out.println("Lista" + list);
    }
}

//1.1 Adicionando elementos:

// add(E e): Adiciona um elemento ao final da lista.
// add(int index, e element): Insere um elemento em um indice específico.

//1.2 Remover elementos:

// remove(int index): Remove o elemento da posição especificada.
// remove(Object o): Remove a primeira ocorrência do objeto especificado. 
