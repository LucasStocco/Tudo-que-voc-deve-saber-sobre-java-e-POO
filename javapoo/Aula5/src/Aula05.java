package Aula05;
public class Aula05 {
    public static void main(String[] args) {
        RemoteControl c = new RemoteControl(); //Não terá parâmetros
        c.connect();
        c.increaseVolume();
        c.turnOnMute();
        c.openMenu();
        c.closeMenu();



    }
}