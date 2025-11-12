package Main;
import PessoalEnvolvido.*;
import Produto.*;
import javax.swing.JOptionPane;
public class Gerenciamento {
    public static void main(String[] args) throws Exception {
        // Iniciação do sistema com a instância da classe construtora
        JOptionPane.showMessageDialog(null, "Iniciando Sistema...", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        Construtora Hunters = new Construtora("Construtora Hunters", 8473647);

        // Criando nossas pessoas envolvidas, escolhemos o construtor de preferencia
        Cliente cliente1 = new Cliente("Luis", "luisrobertosilva@gmail.com", 3000);
        Cliente cliente2 = new Cliente("Roberto", "Silvaroberto@gmail.com", 5000);

        Corretor corretor1 = new Corretor("Gustavo", "343465", 10000, "7879797", 500000);
        
        // teste pra ver se o cliente 1 tem renda suficiente
        System.out.println("Verificação de clientes: ");
        cliente1.verificarAprovacao();
        cliente2.verificarAprovacao();
        // podemos ver as informações desse cliente
        JOptionPane.showMessageDialog(null,cliente1.toString(),"Dados",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,cliente2.toString(),"Dados",JOptionPane.INFORMATION_MESSAGE);
        //Se ele não é aprovado seguimos com o proximo cliente

        //  Criando nossos produtos
        Apartamento ap101 = new Apartamento(101, 1, 40, 4, 200000);
        Apartamento ap201 = new Apartamento(201, 2, 50, 3, 300000);
        Apartamento ap301 = new Apartamento(301, 3, 35, 3, 150000);

        //Criando o prédio
        Empreendimento NovaJardim = new Empreendimento("Nova Jardim", "Avenida roberto camelier n°3500");

        // adicionando os apartamentos
        System.out.println("Adicionando apartamentos...");
        NovaJardim.adicionarApartamento(ap101);
        NovaJardim.adicionarApartamento(ap201);
        NovaJardim.adicionarApartamento(ap301);

        // um metodo para mostrar os apartamentos disponiveis
        System.out.println("Lista de apartamentos: ");
        NovaJardim.ListaDeApartamentosDisponiveis();
        System.out.println("-----------");

        // Registro do prédio e dos funcionarios
        Hunters.registrarEmpreendimento(NovaJardim);
        Hunters.ContratarFuncionarios(corretor1);

        // A venda
        System.out.println("\n");
        System.out.println("Realização de uma venda: ");
        Hunters.venderApartamento(cliente2, ap301, corretor1, 160000);

        // tenta vender de novo e ver o que ocorre
        Hunters.venderApartamento(cliente2, ap301, corretor1, 160000);
        System.out.println("\n");

        // Listar os meus apartamentos disponiveis
        NovaJardim.ListaDeApartamentosDisponiveis();



    } 
} 
