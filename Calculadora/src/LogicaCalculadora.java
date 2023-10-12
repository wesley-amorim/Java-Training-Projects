public class LogicaCalculadora {

    //atributos
    private double number1;
    private double number2;
    private double result;

    
    //construtores
    public LogicaCalculadora(){
        //posso inicializar os atributos , se necessario
    }
    
    //encapsuladores
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    
    //metodos
    public double somar(){
        result = number1 + number2;
        return result;
    }
    

    public double substrair(){
        result = number1 - number2;
        return result;
    }
    public double multiplicar(){
        result = number1 * number2;
        return result;
    }
    public double dividir(){
        if(number2 != 0){
            result = number1 / number2;
            return result;
        } else {
            System.out.println("Impossivel dividir por zero!");
            return 0;
        }
        
    }



}
