
public class Gerente extends Funcionario {
    
    //atributo
    private String departamento;

    //construtor
    public Gerente(double salario, String nome, int idade, String departamento) {
        super(salario, nome, idade);
        this.departamento = departamento;
    }

    public Gerente(){
        //só para fazer usando get e set
        
    }


    //encapsulador

    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    //metodo
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }




    

}
