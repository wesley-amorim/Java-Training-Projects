public class Desenvolvedor extends Funcionario {

    //atributo
    private String linguagem;

    //construtor
    public Desenvolvedor(double salario, String nome, int idade, String linguagem){
        super(salario, nome, idade);
        this.linguagem = linguagem;
    }
    
    public Desenvolvedor(){
        // só para fazer usando get e set
        
    }
    
    //encapsulador
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    //método
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Linguagem: " + linguagem);
    }

    
}
