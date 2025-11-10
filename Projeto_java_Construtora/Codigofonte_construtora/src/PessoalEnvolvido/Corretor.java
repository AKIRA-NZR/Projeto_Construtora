package PessoalEnvolvido;
public class Corretor extends Funcionario {
    private String creci;
    private double vendasTotaisMes;

public Corretor(String nome,String matricula,double salario,String creci,double vendasTotaisMes ){
    super(nome, matricula, salario);
    this.creci = creci;
    this.vendasTotaisMes = vendasTotaisMes;
}
@Override
public String toString(){
    return "Nome: " + nome + "\nMatrícula: " + matricula + "\nSalário: " + salario + "\nCreci: " + creci + "\nVendas mensais: " + vendasTotaisMes;
}
public void resgistrarVendas(double valor){
    if(valor == 0 || valor < 0){
        throw new IllegalArgumentException("Digite um valor válido positivo");
    }
    else{
        this.vendasTotaisMes += valor;
        System.out.println("Venda de " + valor + " Realizada com sucesso");
    }
}
public void setCreci(String creci){
    if(creci == null || creci.trim() .isEmpty()){
        throw new IllegalArgumentException("Tente um código válido");
    }
    else{
        this.creci = creci;
    }
}
public String getCreci(){
    return this.creci;
}
public void setVendasTotaisMes(double valor){
    if(valor == 0 || valor < 0){
        throw new IllegalArgumentException("Vendas tem que ser positivo");
    }
    else{
        this.vendasTotaisMes = valor;
    }
}
public double getVendasTotaisMes(){
    return this.vendasTotaisMes;
}
}
