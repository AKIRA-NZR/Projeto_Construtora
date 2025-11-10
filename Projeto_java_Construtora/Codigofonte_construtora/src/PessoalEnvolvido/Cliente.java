package PessoalEnvolvido;
public class Cliente extends Pessoa {
    private String email;
    private double rendaMensal;
    
    public Cliente(String nome, String cpf,String telefone, String endereco, String email, double rendaMensal){
        super(nome,cpf,telefone,endereco);
        if(email == null || email.trim() .isEmpty()){
            throw new IllegalArgumentException("Digite o email corretamente");
        }
        else if(rendaMensal <= 0){
            throw new IllegalArgumentException("Digite uma renda maior que zero");
        }
        else{
            this.rendaMensal = rendaMensal;
            this.email = email;
        }
    }
    public Cliente(String nome, String email, double rendaMensal){
        super(nome);
        if(email == null || email.trim() .isEmpty()){
            throw new IllegalArgumentException("Digite o email corretamente");
        }
        else if(rendaMensal <= 0){
            throw new IllegalArgumentException("Digite uma renda maior que zero");
        }
        else{
            this.rendaMensal = rendaMensal;
            this.email = email;
        }
    }
    @Override
    public String toString(){
      return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nEmail: " + email + "\nRenda Mensal: " + rendaMensal; 
    }
    public void verificarAprovacao(){
        if(this.rendaMensal == 0 || this.rendaMensal < 4000){
            System.out.println("Não aprovada");
            return;
        }
        else{
            System.out.println("Aprovada");
            return;
        }
    }
    public void setEmail(String email){
        if(email == null || email.trim() .isEmpty()){
            throw new IllegalArgumentException("Digite o email corretamente.");
        }
        else{
            this.email = email;
        }
    }
    public String getEmail(){
        return this.email;
    }
    public void setRendaMensal(double rendaMensal){
        if(rendaMensal == 0 & rendaMensal < 0){
            throw new IllegalArgumentException("Valor deverá ser positivo ou maior que zero");
        }
        else{
            this.rendaMensal = rendaMensal;
        }
    }
    public double getRendaMensal(){
        return this.rendaMensal;
    }
}
