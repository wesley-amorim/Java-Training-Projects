import java.util.Random;

public class GeradorSenha {

    //atributos
    private Random random;

    //construtor
    public GeradorSenha(){
        random = new Random();
    }

    //método
    public String gerarSenha(int tamanho){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder();

        //for que vai gerar senha aleatoria com tamanho especifico
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        //senha.toString vai resolver problema do tipo gerarSenha ser String e pedir um int como parametro
        return senha.toString();

    }


}
