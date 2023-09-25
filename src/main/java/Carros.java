public class Carros implements Cloneable{

    private String marca;
    private Modelo modelo;
    private int anoFabricacao;
    private String cor;
    private double preco;



    public Carros(String marca, Modelo modelo, int anoFabricacao, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Carros clone() throws CloneNotSupportedException {
        Carros carrosClone = (Carros) super.clone();
        carrosClone.modelo = (Modelo) carrosClone.modelo.clone();
        return carrosClone;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "marca=" + marca +
                ", modelo ='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", cor=" + cor +
                ", preco='" + preco + '\'' +
                '}';
    }
}
