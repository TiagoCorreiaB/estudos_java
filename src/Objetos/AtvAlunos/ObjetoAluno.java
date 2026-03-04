package Objetos.AtvAlunos;
public class ObjetoAluno {
    //Bloco de atributos
    private String nome;
    private double nota;
    private static double media = 0.0; //Quando o atributo é static o valor é compartilhado entre todos os objetos, só não pertence a uma instancia em especifico
    private static int quantidade = 0;

    //Construtor
    public ObjetoAluno(String nome, double nota){
        this.nota = nota;
        this.nome = nome;
        media += this.nota;
        quantidade ++;
    }

    //Metodos
    public String mostrarNome(){ // O metodo comum passa a informação de alguem, portanto, usa this.
        return this.nome;
    }

    public double mostrarNota(){
        return this.nota;
    }

    public static Double mostrarMedia(){ // O metodo aqui é static pois retorna apenas valores fixos que não são chamados por NomeDaClasse.metodo()
        if (quantidade == 0.0) return 0.0;
        return media / quantidade;
    }
}
