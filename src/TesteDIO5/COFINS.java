package TesteDIO5;

public class COFINS implements Imposto{
 
    public static Double calcularImposto(double valor){
        if(valor > 17000.0) return (valor * 0.08);
        else return 0.0;
    }   
}
