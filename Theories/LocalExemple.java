public class LocalExemple {

    public void mostrarMensagem() {
        String mensagem = "Ola, sou uma variavel local!"; // Variável Local
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        LocalExemple exemplo = new LocalExemple();
        exemplo.mostrarMensagem();
    }
}

