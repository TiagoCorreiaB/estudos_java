package Objetos.AtvNave_01;

import java.util.Scanner;

public class AtividadeNave_01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ObjetoNave nave = new ObjetoNave(100, 0);
        int escolha = 0, viagem, dano, reparo, parar = 0;
        while (escolha != 5 && parar != 1){
            System.out.println("O que deseja fazer?");
            System.out.println(" [1] Viajar\n [2] Receber Dano\n [3] Reparar\n [4] status da nave\n [5] sair");
            System.out.print("Resposta: ");
            escolha = scan.nextInt();
            System.out.println();

            switch (escolha){
                case 1:  System.out.print("Digite quantos quilometros deseja viajar: "); viagem = scan.nextInt();
                nave.viajar(viagem);
                break;
                case 2: System.out.print("Digite quanto de dano a nave vai receber: "); dano = scan.nextInt();
                parar = nave.receberDano(dano);
                break;
                case 3: System.out.print("Digite quanto de vida será reparado da nave: "); reparo = scan.nextInt();
                nave.reparar(reparo);
                break;
                case 4: nave.status(); 
                break;
                case 5: break;
            }
            System.out.println();
        }

        if (parar == 1){
            System.out.print("A nave ficou sem vida! Game Over");
        }
        else{
            System.out.println("Jogo encerrado, seus status foram: ");
            nave.status(); 
        }
        scan.close();
    }
}
