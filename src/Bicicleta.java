


public class Bicicleta implements IMeioTransporte {

    private int velocidade;
    private static final int VELOCIDADE_MAXIMA = 30;

    public Bicicleta() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade >= VELOCIDADE_MAXIMA) {
            throw new IllegalStateException("A bicicleta já está na velocidade máxima!");
        }
        // A bicicleta acelera mais devagar que o carro. Lógica própria.
        this.velocidade += 2;
        System.out.println("Bicicleta acelerando para " + this.velocidade + " km/h.");
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Bicicleta já está parada.");
            return;
        }
        this.velocidade -= 2;
        System.out.println("Bicicleta freando para " + this.velocidade + " km/h.");
    }
}