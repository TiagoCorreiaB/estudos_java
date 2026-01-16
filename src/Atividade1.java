import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Atividade1 {
    public static void main(String[] args){
        Date relogio = new Date();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        Locale idioma = Locale.getDefault();
        System.out.print("A hora e data do sistema é: ");
        System.out.println(relogio.toString());
        System.out.print("O idioma do sistema é: ");
        System.out.println(idioma.toString());
        System.out.print("A resolução da sua tela é: " + d.width + " x " + d.height);
    }
    
}
