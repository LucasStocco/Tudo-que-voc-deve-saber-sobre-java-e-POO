package src;

public class PequenoGafanhoto extends Pessoa{
    private String login;
    private int totalAssistidos;

    public PequenoGafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo, idade);
        this.login = login;
        this.totalAssistidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistidos() {
        return totalAssistidos;
    }

    public void setTotalAssistidos(int totalAssistidos) {
        this.totalAssistidos = totalAssistidos;
    }
    
    
}
