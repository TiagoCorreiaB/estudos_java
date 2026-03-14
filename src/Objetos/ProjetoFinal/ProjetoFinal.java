package Objetos.ProjetoFinal;

public class ProjetoFinal {
    public static void main(String[] args){
        Video[] v = new Video[3];

        v[0] = new Video("aula 1 de POO");
        v[1] = new Video("aula 12 de PHP");
        v[2] = new Video("aula 10 de HTML5");

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Pedrinho", 22, "M", "Jamelao");
        g[1] = new Gafanhoto("Luizinha", 32, "F", "Melao");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[0], v[0]);
        vis[3] = new Visualizacao(g[1], v[1]);
        vis[4] = new Visualizacao(g[1], v[0]);

        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println();

        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

        /*System.out.println("-----------VIDEOS----------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("-----------GAFANHOTOS----------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/



    }
}
