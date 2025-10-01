package Aula01;
public class Pen {
    public String model;    //Modelo
    public String color;    //Cor
    protected int load;        //Carga
    private float nib;       //Ponta
    protected boolean covered; //Tampada

    //Para mostrar o estado do objeto
    public void status() {
        int numberRepeat = 40; // Número de repetições
        System.out.println(">> Qual a cor da caneta? " + this.color);   //O 'this' significa auto-referência ao objeto em questão
        System.out.println("=".repeat(numberRepeat));
        System.out.println(">> A caneta está tempada? " + this.covered); //Printa se a caneta está tampada ou não por valor lógico
        System.out.println("=".repeat(numberRepeat));
        System.out.println(">> Qual o modelo da caneta? " + this.model); //Printa o modelo
        System.out.println("=".repeat(numberRepeat));
        System.out.println(">> Qual a carga da caneta? " + this.load); //Printa a carga
        System.out.println("=".repeat(numberRepeat));
        System.out.println(">> Qual o tipo de ponta da caneta? " + this.nib); //Printa a carga
        System.out.println("=".repeat(numberRepeat));
    }

    //Criando o método rabiscar
    public void scribble() {
        if (this.covered == true) {
            System.out.println("-> ERRO! Não posso rabiscar.");
        } else {
            System.out.println("-> Estou rabiscando!");
        }
    }

    //Criando o método tampar
    protected void cover() {
        this.covered = true;
    }

    //Criando o método destampar
    protected void uncover() {
        this.covered = false;
    }

}
