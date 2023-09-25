import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarrosTest {

    @Test
    void testClone() throws CloneNotSupportedException {;

        Carros carros = new Carros("Hyundai", new Modelo("gasolina","Joao", 2),2023,"branco",25000);

        Carros carrosClone = carros.clone();
        carrosClone.setMarca("Ford");
        carrosClone.setAnoFabricacao(2010);
        carrosClone.getModelo().setNumeroPortas(2);

        assertEquals("Carros{marca=Hyundai,modelo=hb20, modelo=Modelo{combustivel=gasolina,proprietario=Joao,numeroPortas=2},anoFabricacao=2023,cor=branco,preco=25000}", carros.toString());
        assertEquals("Carros{marca=Jeep,modelo=Modelo{combustivel='gasolina',proprietario='Jose', numeroPortas=2}, anoFabricacao=2021, cor='cinza', preco=230000}", carrosClone.toString());
    }

}
