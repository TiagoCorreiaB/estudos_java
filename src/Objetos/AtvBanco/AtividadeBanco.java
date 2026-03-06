package Objetos.AtvBanco;

public class AtividadeBanco {
    public static void main(String[] args){
        ObjetoBanco p1 = new ObjetoBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC"); // O tipo de conta muda o valor inicial
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();

        ObjetoBanco p2 = new ObjetoBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(1000);

        System.out.println("--------------------------");
        p1.estadoAtual();
        System.out.println("--------------------------");
        p2.estadoAtual();
    }
}
