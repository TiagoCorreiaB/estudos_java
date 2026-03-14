package Objetos.AtvAnimais;

import javax.swing.*;

public class Cachorro extends Lobo{
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }


    public void reagir(String frase) { //Assinatura é o que está nos parenteses
        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Ola")){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int minuto){
        if (hora < 12){
            System.out.println("Abanar");
        }
        else if (hora >= 18){
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e latir");
        }

    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Latir");
            }
            else{
                System.out.println("Latir");
            }
        }
        else{
            if (peso<10){
                System.out.println("Rosnar");
            }
            else{
                System.out.println("Ignorar");
            }
        }
    }


    //Mesmo sendo o mesmo metodo na mesma classe, ainda é permitido, porque as assinaturas são diferenets quanto a |tipo e quantidade|.
    //Mesmo que o retorno fosse diferente, o que importa é a assinatura.
    //Isso é sobrecarga! voce esta sobrecarregando o metodo sem necessidade de sobreposição (Override).

}
