package pizza.ingredientes;

public class Sabor {
    private final String sabor;
    private final String adicional;

    public Sabor(String sabor, String adicional) {
        this.sabor = sabor;
        this.adicional = adicional;
    }

    public String getSabor() {
        return sabor;
    }

    public String getAdicional() {
        return adicional;
    }
}
