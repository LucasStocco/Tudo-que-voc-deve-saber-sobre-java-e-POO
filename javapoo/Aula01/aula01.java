package Aula01;
public class aula01 {
    public static void main(String[] args) {

        //Naturalidade do código, como eu amo POO!
        Pen c1 = new Pen();
        c1.color = "Azul";
        c1.model = "bic (barata)";
        //c1.nib = 0.5f;
        c1.cover();
        c1.scribble();
        //c1.covered = false; //Referência á atributo
        c1.status(); //Referência á método

        //Instanciando uma nova caneta(objeto)
        Pen c2 = new Pen();
        c2.model = "bic (cara)";
        c2.color = "Preta";
        c2.covered = false;
        c2.scribble();
        c2.status();
    }
}

