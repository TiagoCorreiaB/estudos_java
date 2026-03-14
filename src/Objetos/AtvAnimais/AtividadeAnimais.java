package Objetos.AtvAnimais;

public class AtividadeAnimais {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Peixe p = new Peixe();

        m.setPeso(85.2f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println();
        p.setPeso(0.43f);
        p.setIdade(4);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();

        System.out.println();
        a.setPeso(2.33f);
        a.setIdade(7);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();

        System.out.println();
        Canguru c = new Canguru();
        c.setPeso(44.53f);
        c.setIdade(9);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();

        System.out.println();
        Cachorro k = new Cachorro();
        k.setPeso(24.53f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();

        //Isso é polimorfismo! tem o mesmo nome mas age de maneiras diferentes (polimorfismo de sobreposição pois tem a mesma assinatura)
        //Polimorfismo de sobreposição usa @Override

        Cachorro pluto = new Cachorro();

        System.out.println();
        pluto.reagir(2, 12.5f);
        pluto.reagir(true);

        //Isso é sobrecarga!! mesmo metodo, porém fazendo várias coisas diferentes
    }
}
