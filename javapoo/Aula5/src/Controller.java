package Aula05;
//Programa que simula o fumcionamento de um controle remoto de forma simples, para que não receba parâmetros para focar nos conceitos de abstrção, implementação

public interface Controller {
    public abstract void connect();         //Ligar
    public abstract void disconnect();      //Desligar
    public abstract void openMenu();        //Abrir menu
    public abstract void closeMenu();       //Fechar menu
    public abstract void increaseVolume();  //Aumentar volume
    public abstract void decreaseVolume();  //Diminuit volume
    public abstract void turnOnMute();      //Ligar mudo
    public abstract void turnOffMute();     //Desligar mudo
    public abstract void play(); 
    public abstract void pause();
}









