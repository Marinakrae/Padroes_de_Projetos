public class Peca implements FormaGeometrica, Forma3D {

    private String identificacao;
    private Double peDireito;
    private FormaGeometrica[] formaGeometrica;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Double getPeDireito() {
        return peDireito;
    }

    public void setPeDireito(Double peDireito) {
        this.peDireito = peDireito;
    }

    public FormaGeometrica[] getFormaGeometrica() {
        return formaGeometrica;
    }

    public void setFormaGeometrica(FormaGeometrica[] formaGeometrica) {
        this.formaGeometrica = formaGeometrica;
    }

    @Override
    public Double getArea() {
        Double areaTotal = 0.0;
        for(FormaGeometrica formaGeometricas : formaGeometrica){
            areaTotal += formaGeometricas.getArea();
        }
        return areaTotal;
    }

    @Override
    public Double getVolume() {
        return getArea() * peDireito;
    }
}
