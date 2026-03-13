package Objetos.AtvEscola;

public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;

    //Metodos especiais(getters e setters)
    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String s){
        this.setor = s;
    }

    public boolean isTrabalhando(){
        return this.trabalhando;
    }

    //Metodo Comum
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

}
