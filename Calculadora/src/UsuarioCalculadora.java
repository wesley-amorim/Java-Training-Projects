import java.util.Scanner;

public class UsuarioCalculadora {

    public void executarCalculadora(){
        
        LogicaCalculadora calculadora = new LogicaCalculadora(); //instância classe LogicaCalculadora
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true; // iniciando a repetição do programa.

        while (continuar) { // enquanto continuar for "true" , vai se repetir
            
            System.out.println("Program Start: say 'leave' to leave or Enter the first value:  ");
            String input = scanner.next(); //possibilidade de parar o jogo
                
                if(input.equalsIgnoreCase("leave")){
                    
                    System.out.println("Thanks for testing");
                    continuar = false;
                
                } else {
                    
                    double number1 = Double.parseDouble(input);
                    calculadora.setNumber1(number1);

                    
                    // aqui ficaria o system.out.println com o primeiro chamado, mas ele subiu para dar a possibilidade de sair do game.
                    

                    System.out.println("Enter operator ( +, - , * , / ): ");
                    String operator = scanner.next(); //new variable
                    
                    System.out.println("Enter the second value: ");
                    double number2 = scanner.nextDouble(); //existing variable
                    calculadora.setNumber2(number2);

                    double result = 0;

                    switch (operator) {
                        case "+":
                            result = calculadora.somar(); 
                            break;
                        case "-":
                            result = calculadora.substrair(); 
                            break;
                        case "*":
                            result = calculadora.multiplicar(); 
                            break;
                        case "/":
                            result = calculadora.dividir(); 
                            break;
                    
                        default:
                            System.out.println("Operador Invalido");
                    }

                    System.out.println("Resultado: " + result);
                    

                    
                    
                    
            }

            
        }

        scanner.close();
    }
}
