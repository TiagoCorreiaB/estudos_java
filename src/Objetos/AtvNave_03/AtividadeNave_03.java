package Objetos.AtvNave_03;

import java.util.Scanner;

public class AtividadeNave_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        NaveMae naveMae = new NaveMae(100);
        NaveDeGuerra naveBatalha = new NaveDeGuerra(60, 25);
        NaveVarredura naveBusca = new NaveVarredura(40);

        int escolha;
        int viagem;
        int rodada = 0;
        //Fazer breve descrição de jogo
        System.out.println("Bem vindo ao meu Jogo de batalha de naves!");
        System.out.println("Algumas regras antes e continuar: ");
        System.out.println(" -Só é permitido andar entre 1km a 20km por rodada");
        System.out.println(" -As naves de patrulha só procurarão itens de 5 em 5 rodadas");
        System.out.println(" -O dano e a vida dos inimigos estaá aumentando a cada rodada");
        System.out.print("Deseja iniciar a exploração? (1 = sim | 0 = não): ");
        escolha = scan.nextInt();

        //fazer sistema de aumentar vida dos inimigos a cada rodada (aumentando exponencialmente ou dinamicamente os status!!!
        //Fazer sistema de habilidades especiais depois de uma quantiade de rodadas jogada!!!!!!!

        while (escolha == 1) {

            System.out.print("Digite quantos km deseja viajar: ");
            viagem = scan.nextInt();
            while (viagem > 20 || viagem <= 0){
                System.out.print("Apenas pode viajar para distancias maiores que 0 e menores que 20: ");
                viagem = scan.nextInt();
            }
            naveMae.viajar(viagem);

            if (naveMae.getDistancia() > 0 && (naveMae.getDistancia() % 5 == 0 || naveMae.getDistancia() % 7 == 0 || naveMae.getDistancia() % 10 == 0)) {

                System.out.println("\n⚠ Você encontrou uma nave inimiga em " + naveMae.getDistancia() + " km!");

                // Instancia o inimigo aqui para ele vir com vida cheia a cada novo encontro
                NaveInimiga naveInimiga = new NaveInimiga(60, 18);
                boolean batalha = true;

                while (batalha) {

                    System.out.println("\nO que deseja fazer?");
                    System.out.println("[1] Atacar");
                    System.out.println("[2] Reparar nave");
                    System.out.println("[3] Usar arma especial");
                    System.out.println("[4] Status da sua nave");
                    System.out.println("[5] Status do inimigo");
                    System.out.println("[6] Fugir");

                    System.out.print("Resposta: ");
                    escolha = scan.nextInt();

                    switch (escolha) {

                        case 1:
                            int dano = naveBatalha.darDano();
                            naveInimiga.receberDano(dano);
                            System.out.println("Você causou " + dano + " de dano!");

                            if (naveInimiga.getVida() <= 0) {
                                System.out.println("A nave inimiga foi destruída!");
                                batalha = false;
                                break;
                            }

                            // Inimigo ataca de volta
                            int danoInimigo = naveInimiga.darDano();
                            naveBatalha.receberDano(danoInimigo);
                            System.out.println("O inimigo atacou e causou " + danoInimigo + " de dano!");

                            if (naveBatalha.getVida() <= 0) {
                                System.out.println("Sua nave foi destruída! GAME OVER.");
                                batalha = false;
                                escolha = 0; // Força o fim do jogo
                            }
                            break;

                        case 2:
                            naveBatalha.concertarNave();
                            System.out.println("Nave reparada! Vida atual: " + naveBatalha.getVida());
                            break;

                        case 3:
                            break;

                        case 4:
                            System.out.println("--- STATUS DA NAVE DE BATALHA ---");
                            System.out.println("Vida: " + naveBatalha.getVida() + "/" + naveBatalha.getVidaMaxima());
                            System.out.println("Escudo: " + naveBatalha.getEscudo());
                            System.out.println("Poder de Dano: " + naveBatalha.darDano());
                            break;

                        case 5:
                            System.out.println("--- STATUS DO INIMIGO ---");
                            System.out.println("Vida: " + naveInimiga.getVida());
                            break;

                        case 6:
                            System.out.println("Você fugiu!");
                            batalha = false;
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                }
                rodada ++;

                if(rodada % 5 == 0){
                    int loot = naveBusca.fazerBusca();
                    System.out.println("Busca realizada! Nível encontrado: " + loot);
                    naveBatalha.uparEquipamento(loot, loot);
                    System.out.println("Equipamentos e Blindagem melhorados!");
                }

            } else {
                System.out.println("Distância atual: " + naveMae.getDistancia() + " km. Nada encontrado no espaço...");
            }

            if (escolha != 0 && naveBatalha.getVida() > 0) {
                System.out.print("\nDeseja continuar explorando? (1 = sim | 0 = não): ");
                escolha = scan.nextInt();
            }
        }

        System.out.println("Fim de jogo.");
        scan.close();
    }
}