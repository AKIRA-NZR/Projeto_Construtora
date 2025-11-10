package Main;
import PessoalEnvolvido.*;
import javax.swing.JOptionPane;
public class GerenciaConstrutora {
    public static void main(String[] args) throws Exception {
        Corretor c1 = new Corretor("Deyvid", "123445", 5000, "343434",500000);
        c1.resgistrarVendas(20000);
        JOptionPane.showMessageDialog(null, c1.toString(), "Dados do corretor", JOptionPane.INFORMATION_MESSAGE);
        Cliente cliente1 = new Cliente("Gabriel", "teste@gmail.com", 1);
        cliente1.verificarAprovacao();
        System.out.println(cliente1.toString());

    
    }
}
