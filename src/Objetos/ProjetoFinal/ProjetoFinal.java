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



        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

    }
}
