package Objetos.AtvNave_03;

import java.util.Random;

class NaveVarredura extends NaveMae {

    public NaveVarredura(int vidaMaxima) {
        super(vidaMaxima);
    }

    @Override
    public void receberDano(int dano) {
        //Naves de patrulha tem mais vida, mas não podem atacar ninguem
    }

    public int fazerBusca(){
        Random random = new Random();
        return  random.nextInt(10) + 1; //Retorna valor entre 1 a 10 para nivel da vida ou equipamento encontrado
    }
}
