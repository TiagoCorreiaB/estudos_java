package Objetos.AtvEscola_02;

public abstract class Pessoa_02 {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;

    //Metodos especiais (Getters e Setters)
    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String s){
        this.sexo = s;
    }

    //Metodo Comum
    public void fazerAniversario(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "DADOS{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
