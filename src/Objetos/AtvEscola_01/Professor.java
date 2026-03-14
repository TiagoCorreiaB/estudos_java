package Objetos.AtvEscola_01;

public class Professor extends Pessoa { // Vou extender de pessoa pelo exercicio, mas todo professor também é funcionario.
    //Atributos
    private String especialidade;
    private float salario;

    //Metoros Especiais(Getters e Setters)
    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }

    //Metodos Comuns
    public void receberAumento(float aumento){
        this.salario += aumento;
    }
}
