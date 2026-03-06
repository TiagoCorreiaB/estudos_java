package Objetos.AtvLutador;

public class Lutador implements caracterizacao {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor(metodo especial)
    public Lutador(int empates, int derrotas, int vitorias, float peso, float altura, int idade, String nacionalidade, String nome) {
        this.empates = empates;
        this.derrotas = derrotas;
        this.vitorias = vitorias;
        this.setPeso(peso);
        this.altura = altura;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2){
            categoria = "Invalido";
        }
        else if(peso <= 70.3){
            categoria = "Leve";
        }
        else if(peso <= 83.9){
            categoria = "Medio";
        }
        else if (peso <= 120.2){
            categoria = "Pesado";
        }
        else{
            categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos genericos
    @Override
    public void apresentar() {
        System.out.println("---------------------------------------------------------");
        System.out.println("APRESENTANDO NESTA NOITE, O LUTADOR " + getNome() + " PESANDO INCRIVEIS" + getPeso() + "KG");
        System.out.println("ELE TEM UM TOTAL DE " + getVitorias() + " VITORIAS " + getDerrotas() + " DERROTAS E " + getEmpates() + " EMPATES");
        System.out.println("ELE VEIO PRA MOSTRAR O QUE SABE DE SUA TERRA " + getNacionalidade() + " NA CATEGORIA " + getCategoria() + " NO AUGE DOS SEUS " + getIdade() + " ANOS");
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
