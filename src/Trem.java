public class Trem implements IMeioTransporte {
    private int velocidade;
    private static final int VELOCIDADE_MAXIMA = 300;

    public Trem() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        if (velocidade >= VELOCIDADE_MAXIMA) {
            throw new IllegalStateException("O trem já está na velocidade máxima!");
        }
        // O trem acelera bem mais rápido.
        this.velocidade += 25;
        System.out.println("Trem acelerando para " + this.velocidade + " km/h.");
    }

    @Override
    public void frear() {
        if (velocidade <= 0) {
            System.out.println("Trem já está parado.");
            return;
        }
        this.velocidade -= 25;
        System.out.println("Trem freando para " + this.velocidade + " km/h.");
    }
}