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
        this.valorfinal = valorfinal;
    }
}

}
