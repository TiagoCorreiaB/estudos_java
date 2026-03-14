package Objetos.AtvEscola_02;

public class AtividadeEscola_02 {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno_02 a1 = new Aluno_02();

        System.out.println();
        a1.setMatricula(2222);
        a1.setCurso("Informatica");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setNome("Astolfo");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        System.out.println();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setCurso("Informatica");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setNome("Jubileu");
        System.out.println(a1.toString());
        b1.pagarMensalidade();
    }
}
