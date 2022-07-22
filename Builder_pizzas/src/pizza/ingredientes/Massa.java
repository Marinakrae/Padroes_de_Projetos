package pizza.ingredientes;

public class Massa {
    private final boolean integral; //true ou false
    private final int tamanho;

    public Massa(boolean integral, int tamanho) {
        this.integral = integral;
        this.tamanho = tamanho;
    }

    public boolean isIntegral() {
        return integral;
    }

    public int getTamanho() {
        return tamanho;
    }
}
