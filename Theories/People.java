public class People {
    String nome; //Variável de instância
    int idade;
    public void ExibirInfo (){
        System.out.println("Nome: " + nome + ", idade " + idade);
    }
    public static void main(String[] args) {
        People p1 = new People();
        p1.nome = "Lucas";
        p1.idade = 25;
        p1.ExibirInfo();
    }
}
