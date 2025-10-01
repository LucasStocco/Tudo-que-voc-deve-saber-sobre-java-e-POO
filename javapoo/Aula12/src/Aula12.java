package src;

public class Aula12 {
    public static void main(String[] args) {
        // Animal n = new animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        System.out.println("=".repeat(23));
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("=".repeat(23));
        r.setPeso(5.3f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        System.out.println("=".repeat(23));
        p.setPeso(20.3f);
        p.setCorEscama("Azul");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("=".repeat(23));
        a.setPeso(12.3f);
        a.setCorPena("Branco");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("=".repeat(23));
    }
}
