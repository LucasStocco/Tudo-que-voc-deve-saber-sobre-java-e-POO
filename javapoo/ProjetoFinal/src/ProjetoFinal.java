package src;

public abstract class ProjetoFinal { 
    public static void main(String[] args) {
        // Declarando três instâncias de vídeo
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de Raspberry Pi");
        v[2] = new Video("Aula 1 de HTML5");

        // Declarando duas instâncias de gafanhoto
        PequenoGafanhoto g[] = new PequenoGafanhoto[2];
        g[0] = new PequenoGafanhoto("Jubileu", 17, "M", "Jubilitos");
        g[1] = new PequenoGafanhoto("Creuza", 22, "F", "creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste Raspberry Pi
        // Avslisção por porcentagem (output 6)
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

        System.out.println("VÍDEOS\n------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS \n------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
