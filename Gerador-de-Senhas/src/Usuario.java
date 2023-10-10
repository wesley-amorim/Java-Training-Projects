import java.util.Scanner;

public class Usuario {
    // Método para interagir com o usuário e gerar senhas
    public void iniciarTeste() {
        System.out.println("Bem-vindo ao gerador de senhas!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicita ao usuário o tamanho da senha desejada
            System.out.print("Digite o tamanho da senha (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Teste encerrado. Obrigado por usar o gerador de senhas!");
                break;
            }

            try {
                int tamanho = Integer.parseInt(entrada);

                if (tamanho < 8) {
                    System.out.println("O tamanho mínimo da senha é 8 caracteres.");
                    continue;
                }

                // Gera e exibe a senha para o usuário
                String senha = new GeradorSenha().gerarSenha(tamanho);
                System.out.println("Sua senha gerada é: " + senha);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido ou 'sair' para encerrar.");
            }
        }
        scanner.close();
    }

}