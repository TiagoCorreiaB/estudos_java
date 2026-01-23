import java.util.ArrayList;
import java.util.Scanner;
public class AprendendoArrays3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();

        /*
        --Tipos para se usar em ArrayList--
        int	-> Integer
        double -> Double
        float -> Float
        char ->	Character
        boolean -> Boolean
        long -> Long
        */

        System.out.print("Digite quantos alunos quer cadastrar: ");
        int q = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < q; i++){
            System.out.print("Digite o nome do " + (i+1) +" aluno: ");
            String nome = scan.nextLine();
            alunos.add(nome);

            System.out.print("Digite a nota: ");
            int nota = scan.nextInt();
            scan.nextLine();
            while(nota > 10 || nota < 0){
                System.out.println("Nota invalida! (menor que 0 ou maior que 10)");
                System.out.print("Digite a novamente: ");
                nota = scan.nextInt();
                scan.nextLine();
            }
            notas.add(nota);

        }

        System.out.println();
        System.out.println("--Alunos Cadastrados--");
        for (int i = 0; i < notas.size(); i++){
            System.out.println("Aluno: " + alunos.get(i));
            System.out.println("Nota: " + notas.get(i));
            if (notas.get(i) >= 7){
                System.out.println("Situação: Aprovado");
            }
            else{
                System.out.println("Situação: Reprovado");
            }
            System.out.println();
        }
        scan.close();
    }
}
