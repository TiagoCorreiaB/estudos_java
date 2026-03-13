package Objetos.AtvEscola;

public class Aluno extends Pessoa {
    //Atributos
    private boolean matricula;
    private String curso;


    //Metodos Especial(construtor)
    public Aluno(){
        this.matricula = false;
    }

    //Metodos Especiais(getter e setter)
    public String getCurso(){
        return this.curso;
    }

    public boolean isMatricula(){
        return this.matricula;
    }

    public void setCurso(String c){
        this.curso = c;
    }

    //Metodos comuns
    public void cancelarMatricula(){
        this.matricula = false;
    }
    public void matricular(){
        this.matricula = true;
    }

}
