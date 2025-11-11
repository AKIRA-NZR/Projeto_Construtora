package PessoalEnvolvido;
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String endereco;

    //Primeiro construtor
    public Pessoa(String nome,String cpf,String telefone,String endereco){
        if(nome == null || nome.trim() .isEmpty()){
            throw new IllegalArgumentException("O campo nome deve ser inserido corretamente");
        }
        else if(cpf == null || cpf.trim() .isEmpty()){
            throw new IllegalArgumentException("CPF não pode estar vazio");
        }
        else if(telefone == null || telefone.trim() .isEmpty()){
            throw new IllegalArgumentException("Telefone não pode estar vazio");
        }
        else if(endereco == null || endereco.trim() .isEmpty()){
            throw new IllegalArgumentException("Endereço não pode estar vazio");
        }
        else{
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.endereco = endereco;
        }
    }
    // Segundo construtor (vazio)
    public Pessoa(){}
    // Terceiro construtor (Recebe apenas o nome)
    public Pessoa(String nome){
         if(nome == null || nome.trim() .isEmpty()){
            throw new IllegalArgumentException("O campo Nome deve ser inserido corretamente");
        }
        else{
            this.nome = nome;  
        }
    }
    // Método ToString para mostrar dados
    @Override
   public String toString(){
    return "Nome: " + this.nome + "\n"+ "CPF: " + this.cpf + "\n"+ "Endereço: " + this.endereco;
   }
   // As validações setter e getters, apesar de não ser tão necessário decidir colocar pra testes
    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
           throw new IllegalArgumentException("Nome não pode ser vazio. Tente novamente");
        }
        else{
           this.nome = nome;
        }
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        if(cpf == null || cpf.trim() .isEmpty()){
            throw new IllegalArgumentException("O Seu CPF não pode estar vazio");          
        }
        else{
           this.cpf = cpf;
        }
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setTelefone(String telefone){
        if(telefone == null || telefone.trim() .isEmpty()){
           throw new IllegalArgumentException("O Telefone não pode estar vazio");
        }
        else{
           this.telefone = telefone;
        }
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setEndereco(String endereco){
        if(endereco == null || endereco.trim() .isEmpty()){
            throw new IllegalArgumentException("O Endereço não pode estar vazio");
        }
        else{
           this.endereco = endereco;
        }
    }
    public String getEndereco(){
        return this.endereco;
    }
}
