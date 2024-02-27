package calculadora;


public class Operaciones {
    

    public double num1;
    public double num2;

    // Constructor que inicializa los números
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Función para sumar
    public double sumar() {
        return num1 + num2;
    }

    // Función para restar
    public double restar() {
        return num1 - num2;
    }

    // Función para multiplicar
    public double multiplicar() {
        return num1 * num2;
    }

    // Función para dividir
    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }  
    
    //Funcion para exponente
    
    public double exponente (){
        
        return Math.pow (num1 , num2 );
    }
    
    //Funcion para raiz
    
    public double raizCuadrada() {
        return Math.sqrt(num1);
      
    }
    
}
