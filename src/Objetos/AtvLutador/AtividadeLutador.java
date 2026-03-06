package Objetos.AtvLutador;

public class AtividadeLutador {
    public static void main(String[] args){
        Lutador[] L = new Lutador[6]; //Criando Array pra instanciar lutadores (tem que ter o nome da classe do objeto)
        L[0] = new Lutador(2, 0, 1, 78.2f, 1.67f, 32, "Brasil", "Adam");
        L[1] = new Lutador(3, 4, 5, 89.3f, 1.75f, 42, "Alemanha", "Smitch");
        L[2] = new Lutador(0, 1, 2, 80.3f, 1.70f, 22, "Espanha", "Mark Polo");
        L[3] = new Lutador(2, 5, 7, 92.66f, 1.99f, 42, "Brasil", "Guanabara");
        L[4] = new Lutador(5, 4, 6, 102.3f, 1.65f, 19, "Estados Unidos", "Fred Kruger");
        L[5] = new Lutador(3, 1, 6, 83.8f, 1.75f, 22, "Estados Unidos", "Steve Boy");

        L[3].ganharLuta();
        L[3].perderLuta();
        L[3].setPeso(79.2f);

        L[3].status();
    }
}
