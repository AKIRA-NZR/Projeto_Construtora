package Main;
import PessoalEnvolvido.*;
import Produto.Apartamento;
import Produto.Empreendimento;
import Produto.Venda;
import javax.swing.JOptionPane;
public class GerenciaConstrutora {
    public static void main(String[] args) throws Exception {
        Empreendimento NovaJardim = new Empreendimento("Nova Jardim", "Avenida getulio vargas nº 3567");
        Apartamento ap1 = new Apartamento(301, 3, 70, 3, 200000);
        NovaJardim.adicionarApartamento(ap1);
        NovaJardim.ListaDeApartamentosDisponiveis();
        
    
    }   

} 
