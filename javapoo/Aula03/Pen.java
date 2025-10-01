package Aula03;

public class Pen {
    public String model;
    private float nib;
    private String color;
    private boolean cover;

    //Método Construtor
    public Pen(String m, String c, float n) {
        this.model = m;
        this.color = c;
        this.nib = n;
        this.cover();
        //Permite executar tarefas assim que o objeto for estânciado. Para identificar, fique atento ao nome, pois ele sempre terá o mesmo nome da classe main
    }

    public String getModel() { //Não se pode usar void getModel() pois precisa retornar um String, e não pode ser void, pois quem chama o método espera receber o valor do modelo.
        return this.model;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public float getNib() {
        return this.nib;
    }

    public void setNib(float n) {
        this.nib = n;
    }
    //Método tampar
    public void cover() {
        this.cover = true;
    }

    //Método destampar
    public void uncover() {
        this.cover = true;
    }

    public void status() {
        int numberRepeat = 40; // Número de repetições
        System.out.println("=".repeat(numberRepeat));
        System.out.println("SOBRE A CANETA: ");

        //Usando Métodos Getters:
        System.out.println("Modelo: " + this.model);
        System.out.println("=".repeat(numberRepeat));
        System.out.println("Ponta: " + this.nib);
        System.out.println("=".repeat(numberRepeat));
        System.out.println("Cor: " + this.color);
        System.out.println("=".repeat(numberRepeat));
        System.out.println("Está tampada? " + this.cover);
        //Em vez de escrever na tela o modelo diretamente modificando o atributo.
        
        //Usando Métodos Setters:
        System.out.println("Modelo: " + this.getModel());
        System.out.println("=".repeat(numberRepeat));
        System.out.println("Ponta: " + this.getNib());
    }
}
