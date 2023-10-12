public class Funcionario {
    //atributos
    private double salario;
    private String nome;
    private int idade;


    //construtor
    public Funcionario(double salario, String nome, int idade) {
        this.salario = salario;
        this.nome = nome;
        this.idade = idade;
    }

    public Funcionario(){

    }

    //encapsulador

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    


    //método
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario + " R$.");

    }
    
}
