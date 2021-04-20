package modelo;

public class ImplCalculadoraManual implements IOperacion {

    @Override
    public double Multiplicacion(int A, int B) {
        double total =0;
        for(int i=0; i<B; i++){
            total+=A;
        }
        return total;
        
    }

    @Override
    public int Division(int N, int D) {
        int total = 0;
        int aux = N;
        while(aux>=D){
            aux-=D;
            total++;
        }
        return total;
    }

    @Override
    public double Potencia(int b, int e) {
        return 0;
    }
    
}
