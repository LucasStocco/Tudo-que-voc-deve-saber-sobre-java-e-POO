package aula02;
import Aula01.Pen;

public class aula02 {
    public static void main(String[] args) {

        //Naturalidade do código, como eu amo POO!
        Pen c1 = new Pen();

        //Modificando alguns atributos
        c1.model = "BIC cristal";
        c1.color = "Azul claro";
        //c1.nib = 0.5f; (Não é possível modificar pois 'nib' é 'private') 

        //c1.load = 80; (Observe que o método que estamos codando((carga) está dentro de uma classe que está utilizando a classe caneta)
        c1.status();
    }
}
