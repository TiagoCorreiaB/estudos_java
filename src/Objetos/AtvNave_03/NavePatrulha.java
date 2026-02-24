package Objetos.AtvNave_03;

class NavePatrulha extends NaveDeGuerra {
    private int patrulhar;

    public NavePatrulha(int vida, int distancia) {
        super(vida, distancia); // RESOLVE O ERRO: Chama o construtor da NaveDeGuerra
    }

    public int patrulhar(int posicaoAtual) {
        patrulhar += 10;
        return patrulhar;
    }
}
