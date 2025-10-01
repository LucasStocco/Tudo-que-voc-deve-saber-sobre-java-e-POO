package Aula03;
public class aula03 {
    public static void main(String[] args) {
        //Criando a caneta dentro do método principal
        Pen c1 = new Pen("LIC", "Branco", 0.4f);

        //Chamada pelo método acessor
        c1.setModel("BIC barata!");
        //Acessando diretamente o atributo
        c1.model = "BIC carissíma!";

        //Mudando o valor da ponta
        c1.setNib(0.5f);
        //c1.nib = 0.5f; não dá pois 'nib' pertence a um modelo privado, ou seja, ao tentar fazer um acesso diretamente, retornará um erro por ser do tipo privado

        //O 'get.Model()' permite fazer o acesso a 'nib' e 'model', ele protege o acesso ao atributo. Passando pelos métodos getters, que é público
        System.out.println("Tenho uma caneta " + c1.getModel() + " de ponta " + c1.getNib());
        c1.status(); 

    }
}
