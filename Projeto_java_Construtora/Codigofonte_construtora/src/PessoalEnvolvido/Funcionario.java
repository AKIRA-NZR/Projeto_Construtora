package PessoalEnvolvido;
public class Funcionario extends Pessoa {
    protected String matricula;
    protected double salario;

    public Funcionario(String nome, String cpf , String telefone , String endereco,String matricula, double salario){
        this.matricula = matricula;
        this.salario = salario;
        super(nome,cpf,telefone,endereco);
    }
    public Funcionario(String nome, String matricula,double salario){
        super(nome);
        if(matricula == null || matricula.trim() .isEmpty()){
            throw new IllegalArgumentException("Matrícula deve conter algum valor");
        }
        else if(salario <= 0){
            throw new IllegalArgumentException("Salário deve ser maior que zero");
        }
        else{
            this.matricula = matricula;
            this.salario = salario; 
        }
    }
    @Override
    public String toString(){
       return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nMatrícula: " + matricula + "\nSalário: " + salario;
    }
    public void setMatricula(String matricula){
        if(matricula == null || matricula.trim() .isEmpty()){
            throw new IllegalArgumentException("A Matrícula não pode estar vazia");
        }
        else{
            this.matricula = matricula;
        }
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setSalario(double salario){
        if(salario == 0 & salario < 0){
           throw new IllegalArgumentException("O salário deve conter algum valor válido e positivo");
        }
        else{
            this.salario = salario;
        }
    }
    public double getSalario(){
        return this.salario;
    }
        

}
