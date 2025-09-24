// A palavra 'implements' significa que estou assinando o contrato IMeioTransporte.
// O compilador Java agora me obriga a criar os métodos acelerar() e frear().
public class Carro implements IMeioTransporte {

    private int velocidade;
    private static final int VELOCIDADE_MAXIMA = 200; // Constante de velocidade máxima

    public Carro() {
        this.velocidade = 0; // O carro começa parado.
    }

    @Override
    public void acelerar() {
        // Regra de negócio: não posso acelerar além da velocidade máxima.
        if (velocidade >= VELOCIDADE_MAXIMA) {
            // Lanço uma exceção se a regra for quebrada.
            throw new IllegalStateException("O carro já está na velocidade máxima!");
        }
        this.velocidade += 10;
        System.out.println("Carro acelerando para " + this.velocidade + " km/h.");
    }

    @Override
    public void frear() {
        // Regra de negócio: não posso ter velocidade negativa.
        if (velocidade <= 0) {
            System.out.println("Carro já está parado.");
            return; // Saio do método aqui.
        }
        this.velocidade -= 10;
        System.out.println("Carro freando para " + this.velocidade + " km/h.");
    }
}