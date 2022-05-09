import java.util.Objects;

public class Imovel implements FormaGeometrica, Forma3D{

    private Peca[] pecas;
    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoUso tipoUso;

    public enum TipoUso { //enumeração de constantes
        RESIDENCIAL(1), COMERCIAL(2);

        TipoUso(Integer id) {
            this.id = id;
        }

        private Integer id;

        public Integer getId() {
            return id;
        }
        public static TipoUso valueOf(int i) {
            for (TipoUso tipoUso : values()) {
                if (tipoUso.id == i) return tipoUso;
            }
            return null;
        }

    }

    //alt insert
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoUso getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(TipoUso tipoUso) {
        this.tipoUso = tipoUso;
    }

    public Peca[] getPecas() {
        return pecas;
    }

    public void setPecas(Peca[] pecas) {
        this.pecas = pecas;
    }

    public Imovel(String identificacao, String proprietario, String endereco, TipoUso identificacao1) {
        this.identificacao = identificacao;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.tipoUso = tipoUso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Objects.equals(identificacao, imovel.identificacao) && Objects.equals(proprietario, imovel.proprietario) && Objects.equals(endereco, imovel.endereco) && tipoUso == imovel.tipoUso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacao, proprietario, endereco, tipoUso);
    }

    @Override
    public Double getArea() {
        Double areaTotal = 0.0;
        for(FormaGeometrica formaGeometrica : pecas){
            areaTotal += formaGeometrica.getArea();
        }
        return areaTotal;
    }

    @Override
    public Double getVolume() {
        double volumeTotal = 0.0;
        for (Peca p : pecas) {
            volumeTotal += p.getVolume();
        }
        return volumeTotal;
    }
}
