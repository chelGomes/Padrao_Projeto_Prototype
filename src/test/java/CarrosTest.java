import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarrosTest {

    @Test
    void testClone() throws CloneNotSupportedException {;

        Carros carros = new Carros("Hyundai", new Modelo("gasolina","Joao", 2),2023,"branco",25000);

        Carros carrosClone = carros.clone();
        carrosClone.setMarca("Ford");
        carrosClone.setAnoFabricacao(2010);
        carrosClone.getModelo().setNumeroPortas(4);

        assertEquals("Carros{" +
                "marca=" + "Hyundai" +
                ", combustivel ='" + "gasolina" + '\'' +
                ", proprietario ='" + "Joao" + '\'' +
                ", numeroPortas ='" + 2 + '\'' +
                ", anoFabricacao=" + 2023 +
                ", cor=" + "branco" +
                ", preco='" + 25000.0 + '\'' +
                '}', carros.toString());

        assertEquals("Carros{" +
                "marca=" + "Ford" +
                ", combustivel ='" + "gasolina" + '\'' +
                ", proprietario ='" + "Joao" + '\'' +
                ", numeroPortas ='" + 4 + '\'' +
                ", anoFabricacao=" + 2010 +
                ", cor=" + "branco" +
                ", preco='" + 25000.0 + '\'' +
                '}', carrosClone.toString());
    }

}
