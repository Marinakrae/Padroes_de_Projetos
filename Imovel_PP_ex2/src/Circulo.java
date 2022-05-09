public class Circulo implements FormaGeometrica{ //Math.PI * raio *raio

    private Double raio;
    private Double grausCirculo;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
        this.grausCirculo = 360.0;
    }

    @Override
    public Double getArea() {
        return Math.PI*raio*raio*(grausCirculo/360.0);
    }
}

