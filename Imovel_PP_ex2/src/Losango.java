public class Losango implements FormaGeometrica{

    private Double diagonalMaior;
    private Double diagonalMenor;

    public Double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(Double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public Double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(Double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public Double getArea() {
        return (diagonalMaior*diagonalMenor)/2.0;
    }
}
