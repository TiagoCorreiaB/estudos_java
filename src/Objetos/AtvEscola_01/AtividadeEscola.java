package Objetos.AtvEscola_01;

public class AtividadeEscola {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informatica");
        p3.setSalario(2450.50f);
        p4.setSetor("Estoque");

        p1.setSexo("M");
        p1.setIdade(17);



        System.out.println(p1.toString());

        //p1.receberAum(541.4) não da, pois pessoa não tem essa função.
        //p2.mudarTrabalho() p2 é para aluno.
        //p4.cancelarMatricula não pode porque só aluno cancela matricula
    }
}
