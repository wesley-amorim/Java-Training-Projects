public class FuncionarioApp {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario1 = new Gerente(5000, "Thais", 24, "Clinica Veterinária");

        Desenvolvedor funcionario2 = new Desenvolvedor();
        funcionario2.setSalario(5000);
        funcionario2.setNome("Wesley");
        funcionario2.setIdade(27);
        funcionario2.setLinguagem("Java");


        funcionario1.exibirInformacoes();
        System.out.println();
        funcionario2.exibirInformacoes();


    }
}
