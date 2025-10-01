package UltraEmojiCombat;

public class Fighter {
    //Atributos
    private Integer age, victories, defeats, draws;
    private String name, nacionality, category;
    private Float height, weight;

    //Métodos Públicos('present' e 'status' serão usados para apresentar informações na tela)

    //Método para apresentar
    public void present() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getName());
        System.out.println("Diretamente de: " + this.getNaciolity());
        System.out.println("Com: " + this.getAge() + " anos e " + this.getWeight())
        System.out.println("Pesando " + this.getHeight() + "Kg");
        System.out.println(this.getVictories() + "vitórias");
        System.out.println(this.getDefeats() + "derrotas e");
        System.out.println(this.getDraws() + " empates!");
    }
    //Método de status
    public void status() {
        System.out.println(this.getName() + " é um peso " + this. getCategory());
        System.out.println("Ganhou " + this.getVictories() + " vezes");
        System.out.println("Perdeu  " + this.getDefeats() + " vezes");
        System.out.println("Empatou " + this.getDraws() + " vezes");
    }
    //Método para ganhar a luta
    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }
    //Método para perder a luta
    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
    //Método para empatar a luta
    public void drawFight() {
        this.setDraws(this.draws() + 1);
    }
    //Métodos Especiais
    //Criando o método construtor
    public Fighter(String na, String nac, int ag, float he, float we, int vi, int de, int dr) {
        this.name = na;         //Nome(no)
        this.nacionality = nac; //Nacionalidade(na)
        this.age =  ag;         //Idade(id)
        this.setHeight(he);     //Peso(pe)
        this.weight = we;       //Altura(al)
        this.victories = vi;    //Vitórias(vi)
        this.defeats = de;      //Derrotas(de)
        this.draws = dr;        //Empates(em)
    }
    //Criando os métodos Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNaciolity() {
        return nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
        //Método interno
        this.setCategory();
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getCategory() {
        return category;
    }
    //Do lado de fora não é possível usar 'getCategory' pois a cetegoria muda automaticamente quando a atualização do 'height' é feito.
    private void setCategory() {
        if (this.height < 52.2) {
            this.category = "Inválido";
        } else if (this.height <= 70.3) {
           this.category = "Leve";
        } else if (this.height 83.9) {
            this.category = "Médio";
        } else if (this.height <= 120.2) {
            this.category = "Pesado";
        } else {
            this.category = "Inválido"
        }
    }

    public int getVictories() {
        return victories;
    }
    public void setVictories(int victories) {
        this.victories = victories
    }
    public int getDefeats() {
        return age;
    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
    public int getDraws() {
        return draws;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }
}
