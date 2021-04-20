package modelo;
import static java.lang.Math.*;

public class ImplCalculadoraAvanzada implements IOperacion {

    @Override
    public double Multiplicacion(int A, int B) {
        return A*B;    
    }

    @Override
    public int Division(int N, int D) {
        return N/D;
    }

    @Override
    public double Potencia(int b, int e) {
        return pow(b,e);
    }
    
}
