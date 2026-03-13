package Objetos.AtvEscola;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Metodo Especial (getters e setters)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    //Metodo comum
    public void fazerAniversario(){
        this.idade ++;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
