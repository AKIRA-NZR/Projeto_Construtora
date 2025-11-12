package Produto;
import java.util.List;
import java.util.ArrayList;
import PessoalEnvolvido.*;


public class Construtora {
    private String nomeConstrutora;
    private int cnpj;
    private List<Empreendimento> empreendimentos;
    private List<Funcionario> funcionarios;
    private List<Venda> vendasConcluidas;
    
    public Construtora (String nomeConstrutora, int cnpj){
        if(nomeConstrutora == null || nomeConstrutora.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio");        
        }
        else if(cnpj == 0){
            throw new IllegalArgumentException("O cnpj não pode ser zero");
        }
        else{
            this.nomeConstrutora = nomeConstrutora;
            this.cnpj = cnpj;
            this.empreendimentos = new ArrayList<>();
            this.funcionarios = new ArrayList<>();
            this.vendasConcluidas = new ArrayList<>();   
        } 
    }
    public void venderApartamento(Cliente cliente, Apartamento apartamentoVendido, Corretor corretor, double valorfinal ){
        if  (apartamentoVendido.getStatus().equals("Disponivel")){
            apartamentoVendido.setStatus("Vendido");

            Venda registroVenda = new Venda(cliente, corretor, apartamentoVendido, valorfinal);
            this.vendasConcluidas.add(registroVenda);

            System.out.println(" Venda confirmada para o cliente " + cliente.getNome() + " do apartamento nº " + apartamentoVendido.getNumero() + " pelo corretor " + corretor.getNome() + " pelo valor final de: R$" + String.format("%.2f", valorfinal));
    }   else {
        System.out.println(" Não é possível realizar a venda, o apartamento nº: " + apartamentoVendido.getNumero() + " não está disponível.");
  } 
    }
    //Métodos
    public void ContratarFuncionarios(Funcionario funcionario){
        if(funcionario == null){
            throw new IllegalArgumentException("O funcionario deve conter algum valor");
        }
        else{
            this.funcionarios.add(funcionario);
            System.out.println("Funcionario: " + funcionario.getNome() + " registrado com sucesso!");
        }
    }
    public void registrarEmpreendimento(Empreendimento empreendimento){
        if(empreendimento == null){
            throw new IllegalArgumentException("Empreendimento não pode estar vazio");
        }
        else{
            this.empreendimentos.add(empreendimento);
            System.out.println("Empreendimento " + empreendimento.getNomeEmp() + " Registrado com sucesso!");
        }
    }
    public void registrarVendasConcluidas(Venda venda){     
        if(venda == null){
            throw new IllegalArgumentException("Venda não pode estar vazio");
        }
        else{
            this.vendasConcluidas.add(venda);
            System.out.println("registrado com sucesso" );
        }
    }

 
//gets
    public String getnomeConstrutora(){
        return this.nomeConstrutora;
    }
    public int getcnpj(){
    return this.cnpj;
    } 
//sets
    public void setnomeConstrutora(String nomeConstrutora){
        this.nomeConstrutora = nomeConstrutora;
    }
    public void setcnpj(int cnpj){
        this.cnpj = cnpj;
    }



}
 
 