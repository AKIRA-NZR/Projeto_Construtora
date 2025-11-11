package Produto;
import java.util.List;
import java.util.ArrayList;
public class Empreendimento{
    private String nomeEmp;
    private String endereco;
    private List<Apartamento> listaApartamento;
    //Construtores  mano? ode ta o o atributo true? atributo true?
    public Empreendimento(String nomeEmp, String endereco){
        if(nomeEmp == null || nomeEmp.trim() .isEmpty()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        else if(endereco == null || endereco.trim().isEmpty()){
            throw new IllegalArgumentException("Endereço não pode estar vazio");
        }
            this.endereco = endereco;
            this.nomeEmp = nomeEmp;
            this.listaApartamento = new ArrayList<>();
    }
    // Metódos de mostrar dados e adicionar apartamento.
    public String toString(){
        return "Nome do prédio: " + nomeEmp + "\nEndereço: " + endereco;
    }
    public void adicionarApartamento(Apartamento apartamento){
        if(apartamento == null){
            throw new IllegalArgumentException("Adicione um apartamento válido");
        }
        else{
            this.listaApartamento.add(apartamento);
            System.out.println("Apartamento " + apartamento.getNumero() + " Adicionado ao prédio " + this.nomeEmp);
        }
    }
    public void ListaDeApartamentosDisponiveis(){
        for (Apartamento apartamento : this.listaApartamento) {
            if(apartamento.getStatus().equals("Disponivel")){
                System.out.println(apartamento.toString());
            }
        }
    }
    // Getters e setters
    public void setNomeEmp(String nomeEmp){
        if(nomeEmp == null || nomeEmp.trim() .isEmpty()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        else{
            this.nomeEmp = nomeEmp;
        }
    }
    public String getNomeEmp(){
        return this.nomeEmp;
    }
    public void setEndereco(String endereco){
        if(endereco == null || endereco.trim().isEmpty()){
            throw new IllegalArgumentException("Endereço não pode estar vazio");
    }
        else{
        this.endereco = endereco;
        }
    }
    public String getEndereco(){
        return this.endereco;
    }
}



