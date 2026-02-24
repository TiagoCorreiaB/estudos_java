package Objetos.AtvNave_03;

class NaveMae extends Nave {
    private static int pontos;

    public NaveMae(int vida, int distancia) {
        super(vida, distancia); // Passa os valores para a classe Nave
        pontos += 10;
    }

    public int getPontos() {
        return pontos;
    }
}
