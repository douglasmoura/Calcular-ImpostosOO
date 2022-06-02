package TesteDIO5;

public class IPI implements Imposto{
    
    public static Double calcularImposto(double valor){

        if(valor < 25000.0) return (valor * 0.05);
        else return  (valor * 0.10);
                 
    }   
}
