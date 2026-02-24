package Objetos.AtvNave_02;

import java.util.Scanner;

public class AtividadeNave_02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Começamos sem polimorfismo
        NaveM naveMae = new NaveM(100, 0);
        NaveDeG naveBatalha = new NaveDeG(60, 0);
        NaveIni naveInimiga = new NaveIni(60, 0);

        int escolha = 0, viagem, dano, reparo, parar = 0, destruir = 0;
        while (escolha != 5 && parar != 1){
            int escolhaNave = 0;

            System.out.println("O que deseja fazer?");
            System.out.println(" [1] Viajar\n [2] Atacar\n [3] Reparar\n [4] status da nave\n [5] sair");
            System.out.print("Resposta: ");
            escolha = scan.nextInt();
            System.out.println();

            switch (escolha){
                case 1:  System.out.print("Digite quantos quilometros deseja viajar: "); viagem = scan.nextInt();
                naveMae.viajar(viagem);
                naveBatalha.viajar(viagem);
                break;

                case 2: System.out.print("Digite quanto de dano a nave inimiga vai receber: "); dano = scan.nextInt();

                naveInimiga.receberDano(25);
                destruir = naveBatalha.receberDano(25);

                break;

                case 3: System.out.println("Digite quanto de vida será reparado da nave: "); reparo = scan.nextInt();
                        System.out.print("Deseja reparar: [1] Nave Mãe, [2] Nave de Guerra: ");
                        escolhaNave = scan.nextInt();
                if (escolhaNave == 1){
                    
                    naveMae.reparar(reparo);
                }
                else{
                    if (destruir == 0){
                        naveBatalha.reparar(reparo);
                    }
                    else{
                        System.out.println("A nave de batalha foi destruida e não pode ser reparada");
                    }
                }
                break;

                case 4: naveMae.status();
                        System.out.println();
                        System.out.println("Os status da nave de guerra foram: ");
                        naveBatalha.status();
                if (destruir == 1){
                    System.out.println("A nave de batalha foi destruida");
                }
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
            naveMae.status();
            System.out.println();
            System.out.println("Os status da nave de guerra foram: ");
            naveBatalha.status();
        }
        scan.close();
    }
}
