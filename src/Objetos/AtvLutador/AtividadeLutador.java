package Objetos.AtvLutador;

public class AtividadeLutador {
    public static void main(String[] args){
        Lutador[] L = new Lutador[6]; //Criando Array pra instanciar lutadores (tem que ter o nome da classe do objeto)
        L[0] = new Lutador(68.2f, 1.67f, 32, "Brasil", "Adam");
        L[1] = new Lutador(69.3f, 1.75f, 42, "Alemanha", "Smitch");
        L[2] = new Lutador(70.3f, 1.70f, 22, "Espanha", "Mark Polo");
        L[3] = new Lutador(72.66f, 1.99f, 42, "Brasil", "Guanabara");
        L[4] = new Lutador(102.3f, 1.65f, 19, "Estados Unidos", "Fred Kruger");
        L[5] = new Lutador(84.8f, 1.75f, 22, "Estados Unidos", "Steve Boy");

        Luta combate = new Luta();

        combate.marcarLuta(L[0], L[1]);
        combate.lutar();
        L[0].status();
        L[1].status();
    }
}
