import java.util.Scanner;
import java.util.ArrayList;
public class AprendendoObjetos {
    public static void main(String[] args){
        //Cadastro simples de alunos
        Scanner scan = new Scanner(System.in);
        ArrayList<ObjetoAluno> classe = new ArrayList<>();

        System.out.print("Digite quantos alunos quer cadastrar: ");
        int q = scan.nextInt();
        scan.nextLine(); //Limpa o buffer do scanner, pois depois do int da erro se vier uma string

        for (int i = 0; i < q; i++){
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nome = scan.nextLine();

            System.out.print("Digite a nota de " + nome + ": ");
            double nota = scan.nextDouble();
            scan.nextLine(); //Limpando o Buffer novamente
            System.out.println();

            ObjetoAluno aluno = new ObjetoAluno(nome, nota);
            classe.add(aluno); //Adicionando na lista cada aluno
        }
        System.out.println("ALUNOS CADASTRADOS:");

        for (int i = 0; i < classe.size(); i++){
            System.out.println("Aluno " + (i+1));
            System.out.println("Nome: " + classe.get(i).mostrarNome()); //Vai chamar metodo? precisa saber de quem é e qual a posição dele
            System.out.println("Nota: " + classe.get(i).mostrarNota());
            System.out.println();
        }
        System.out.println("Média da turma: " + ObjetoAluno.mostrarMedia());
        scan.close();
    }
}
