package aula04;
public class Aula04 {
    public static void main(String[] args) {
        //Criando as contas dos usuários
        //1º Usuário
        BankAccount personOne = new BankAccount();
        personOne.setNumAccount(1);
        personOne.openAccount("CC");
        personOne.setUser("Lucas");
        personOne.currentStatus();

        //2º Usuário
        BankAccount personTwo = new BankAccount();
        personTwo.setNumAccount(2);
        personTwo.openAccount("CP");
        personTwo.setUser("Jubileu");
        personTwo.currentStatus();

        //Mechendo com o money!
        //Depósito do 1º usuário
        personOne.deposit(100);
        //Depósito do 2ª usuário
        personTwo.deposit(500);
        personTwo.withdraw(10);

        personOne.closeAccount();
    }
}
