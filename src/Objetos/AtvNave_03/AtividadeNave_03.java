package Objetos.AtvNave_03;

import java.util.Scanner;
import java.util.ArrayList;

public class AtividadeNave_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Nave> comboio = new ArrayList<>();

        // Agora passando os argumentos necessários (vida, distancia)
        NaveDeGuerra naveCombate = new NaveDeGuerra(100, 0);
        NavePatrulha navePatrulha = new NavePatrulha(80, 0);

        comboio.add(naveCombate);
        comboio.add(navePatrulha);

        System.out.println("Comboio pronto com " + comboio.size() + " naves!");

        // O restante do seu menu continua aqui...
        scan.close();
    }
}