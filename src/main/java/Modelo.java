public class Modelo implements Cloneable{
    private String combustivel;
    private String proprietario;
    private int numeroPortas;

    public Modelo(String combustivel, String proprietario, int numeroPortas){
        super();
        this.combustivel = combustivel;
        this.proprietario = proprietario;
        this.numeroPortas = numeroPortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Veiculo{" +
                "combustivel='" + combustivel + '\'' +
                ", proprietario =" + proprietario + '\'' +
                ", numeroPortas =" + numeroPortas +
                '}';
    }
}
