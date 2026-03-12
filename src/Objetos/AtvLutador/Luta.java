package Objetos.AtvLutador;
import java.util.Random;

public class Luta {
    Random random = new Random();

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Getters e Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    //Metodos comuns
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            this.desafiado.apresentar();
            System.out.println("E do outro lado!");
            this.desafiante.apresentar();
            int vencedor = (int)(Math.random() * 3);
            System.out.println("---------------------------------------------------------");
            switch (vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " ganhou a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

            }
            System.out.println("---------------------------------------------------------");


        }
        else{
            System.out.println("A luta não poderá acontecer");
        }
    }
}
