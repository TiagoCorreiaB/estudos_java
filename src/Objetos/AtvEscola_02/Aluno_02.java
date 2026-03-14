package Objetos.AtvEscola_02;

public class Aluno_02 extends Pessoa_02{
    //Atributos
    private int matricula;
    private String curso;

    //Metodos especiais(getter e setter)
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
}
