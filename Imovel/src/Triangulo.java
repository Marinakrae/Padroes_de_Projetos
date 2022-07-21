public class Triangulo implements FormaGeometrica{

    private Double base;
    private Double altura;

    @Override
    public Double getArea() {
        return (base*altura)/2.0;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


}
