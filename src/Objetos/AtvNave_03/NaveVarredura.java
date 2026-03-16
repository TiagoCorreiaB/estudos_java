package Objetos.AtvNave_03;

import java.util.Random;

public class NaveVarredura extends NaveMae {

    public NaveVarredura(int vidaMaxima) {
        super(vidaMaxima);
    }

    @Override
    public void receberDano(int dano) {
        //Não recebe dano
    }

    public int fazerBusca(){
        Random random = new Random();
        return  random.nextInt(10) + 1; //Retorna valor entre 1 a 10 para nivel da vida ou equipamento encontrado
    }
}
