import Aula05.Controller;

public class RemoteControl implements Controller {

    //Atributos
    private int volume;        //Volume
    private boolean connected; //Ligado
    private boolean playing;   //Tocando

    //Métodos Especiais
    public RemoteControl() {
        this.volume = 50;
        this.connected = true;
        this.playing = false;
    }

    //Criando Os Métodos Getters e Setters
    private int getVolume() {
        return volume;
    }
    
    private int setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isConnected() {
        return connected;
    }

    private void setConnected(boolean connect) {
        this.connected = connect;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    //Métodos Abstratos
    @Override
    public void connect() {
        this.setConnected(true);
    }

    @Override
    public void disconnect() {
        this.setConnected(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Está ligado? " + this.getConnected());
        System.out.println("Está tocando? " + this.getPlaying());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.println("[]");
        }
     }

    @Override
    public void closeMenu() {
        System.out.println("Fechando Menu...");
     }

    @Override
    public void increaseVolume() {
        //Só aumenta o volume se a tv estiver ligada
        //Volume começa com 50 pois foi definido no construtor
        if (this.getConnected()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println(">>ERRO: Impossível aumentar o volume.");
        }
    }

    @Override
    public void decreaseVolume() {
        //Só diminui o volume se a tv estiver ligada
        //Volume começa com 50 pois foi definido no construtor
        if (this.getConnected()) {
            this.setVolume(this.getVolume() - 1)
        } else {
            System.out.println(">>ERRO: Impossível diminuir o volume.");
        }

    }

    @Override
    public void turnOnMute() {
        //Se a tv já estiver ligada e  não estiver no mudo
        if (this.getConnected() && this,getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void turnOffMute() {
         if (this.getConnected() && this.getVolume() == 0) {
            this.setVolume(50);
         }
    }

    @Override
    public void play() {
        if (this.getConnected() && !(this.getPlaying())) {
            this.setPlaying(true);
        } else {
            System.out.println(">> Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.getPlaying() && this.getPlaying()) {
            this.setPlaying(false);
        } else {
            System.out.println(">> Não consegui pausar. ");
        }
    }
}

/*  Observações
 *  >> Quando usar valores do tipo 'boolean' use 'is' ao invés de 'get'
 * 
 * >> '@Overide' significa sobrescrever, pois já havia um método definido(abstrato) e que agora está sendo sobrescrito.
 * 
 * 
 * 
 */