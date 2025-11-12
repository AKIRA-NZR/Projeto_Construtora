package Produto;

public class Apartamento {
    private int numero;
    private int andar;
    private double tamanho;
    private int numeroQuartos;
    private String status;
    private double valor;

    public Apartamento(int numero, int andar, double tamanho, int numeroQuartos,double valor){
        if(numero <= 0 ){
            throw new IllegalArgumentException("O número do apartamento não pode ser zero ou negativo");
        }
        else if(andar <= 0){
            throw new IllegalArgumentException("O andar do apartamento não pode ser vazio");
        }
        else if(tamanho <= 0 || tamanho > 100){
            throw new IllegalArgumentException("A metragem do apartamento não pode exceder 100 metros ou ser menor que 0");
        }
        else if(numeroQuartos < 0 || numeroQuartos > 5){
            throw new IllegalArgumentException("O número de quartos não pode exceder 5 e ser menor que zero");
        }
        else if(valor <= 0){
            throw new IllegalArgumentException("Valor não pode ser negativo ou zero");
        }
        else{
            this.numero = numero;
            this.andar = andar;
            this.tamanho = tamanho;
            this.numeroQuartos = numeroQuartos;
            this.valor = valor;
            this.status = "Disponivel";
        }
    }
    @Override
    public String toString(){
        return "Número: " + numero + "\nAndar: " + andar + "\nTamanho(Metros): " + tamanho + "\nNúmero de quartos: " + numeroQuartos + "\nValor do apartamento: " + "R$" + valor ;
    }
    public void setNumero(int numero){
          if(numero <= 0 ){
            throw new IllegalArgumentException("O número do apartamento não pode ser zero ou negativo");
        }
        else{
            this.numero = numero;
        }
    }
    public int getNumero(){
        return this.numero;
    }
    public void setAndar(int andar){
        if(andar <= 0){
            throw new IllegalArgumentException("O andar do apartamento não pode ser vazio");
        }
        else{
            this.andar = andar;
        }
    }
    public int getAndar(){
        return this.andar;
    }
    public void setTamanho(double tamanho){
        if(tamanho <= 0 & tamanho > 100){
            throw new IllegalArgumentException("A metragem do apartamento não pode exceder 100 metros ou ser menor que 0");
    }
    else{
        this.tamanho = tamanho;
    }
    }
    public double getTamanho(){
        return this.tamanho;
    }
    public void setNumeroQuartos(int numeroQuartos){
        if(numeroQuartos <= 0 & numeroQuartos > 5){
            throw new IllegalArgumentException("O número de quartos não pode exceder 5 e ser menor que zero");
    }
    else{
        this.numeroQuartos = numeroQuartos;
    }
    }
    public int getNumeroQuartos(){
        return this.numeroQuartos;
    }
    public void setStatus(String status){
        if(status == null || status.trim() .isEmpty()){
            throw new IllegalArgumentException("Status não pode ser vazio!");
        }
        if(this.status != null & this.status.equals("Vendido")){
            throw new IllegalArgumentException("Apartamento " + this.numero +  " Já foi vendido");
        }
        else{
            this.status = status;
        }
    }
    public String getStatus(){
        return this.status;
    }
    
} 
