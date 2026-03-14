package Objetos.AtvEscola_02;

public class Bolsista extends Aluno_02 {
    //Atributo
    private float bolsa;

    //Metodo Especial (Getters e Setters)

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    //Metodo Comum
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! pagamento facilitado");
    }
}
