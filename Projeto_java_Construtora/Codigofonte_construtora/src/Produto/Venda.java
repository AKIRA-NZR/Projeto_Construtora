package Produto;
import PessoalEnvolvido.*;

public class Venda {
    
private Cliente cliente;
private Corretor corretor;
private Apartamento apartamentoVendido;
private Double valorfinal;


public Venda(Cliente cliente, Corretor corretor, Apartamento apartamentoVendido, Double valorfinal) {
    if (cliente == null) {
        throw new IllegalArgumentException("Não pode ocorrer uma compra sem cliente.");
    }
    if (corretor == null){
        throw new IllegalArgumentException(" Não pode ocorrer compra sem o corretor.");
    }
    if (apartamentoVendido == null){
        throw new IllegalArgumentException(" Não pode ocorrer compra sem o apartamento.");
    }
    if (valorfinal == null){
        throw new IllegalArgumentException(" O valor final não pode ser nulo ");
    } else if (valorfinal == 0) {
        throw new IllegalArgumentException(" O valor final deve ser maior que zero ");
    }
    
    
    this.cliente = cliente;
    this.corretor = corretor;
    this.apartamentoVendido = apartamentoVendido;
    this.valorfinal = valorfinal;

}

public void confirmarvenda(){
  if  (apartamentoVendido.getStatus().equals("Disponivel")){
        System.out.println(" Venda confirmada para o cliente: " + cliente.getNome() + " do apartamento nº: " + apartamentoVendido.getNumero() + " pelo corretor: " + corretor.getNome() + " pelo valor final de: R$" + String.format("%.2f", this.valorfinal));
    } else {
        System.out.println(" Não é possível realizar a venda, o apartamento nº: " + apartamentoVendido.getNumero() + " não está disponível.");
    
  } 
}

//metodos get  muda? esse metodo tem que se conectar com o meu , tu não pode vender um apartamento se ele n estiver disponivel e o metodo só ta mostrando uma mensagem, ele não acontece nada
public Cliente getCliente() {
    return cliente;
}
public Corretor getCorretor() {
    return corretor;
}
public Apartamento getapartamentoVendido(){
    return apartamentoVendido;
}
public Double getvalorfinal(){
    return valorfinal;
}

//metodos set
public void setCliente(Cliente cliente) {
    if (cliente == null) {
        throw new IllegalArgumentException("A compra não pode ocorrer pois não contem o nome do comprador");
    }
    else {
        this.cliente = cliente;

    }
}

public void setCorretor(Corretor corretor) {
    if (corretor == null) {
        throw new IllegalArgumentException("A compra não pode ocorrer pois não contem o nome do corretor de vendas");
    }
    else {
        this.corretor = corretor;

    }
}

public void setapartamentoVendido(Apartamento apartamentoVendido){
    if (apartamentoVendido == null) {
        throw new IllegalArgumentException("selecionar um apartamento com o corretor");
    }else{
        this.apartamentoVendido = apartamentoVendido;
    }
}
public void setvalorfinal(Double valorfinal){
    if (valorfinal == null) {
        throw new IllegalArgumentException(" O valor final não pode ser nulo ");
    } else if (valorfinal == 0) {
        throw new IllegalArgumentException(" O valor final deve ser maior que zero ");
    }else{
        this.valorfinal = valorfinal + (valorfinal * 0.06);
    }
}

}
