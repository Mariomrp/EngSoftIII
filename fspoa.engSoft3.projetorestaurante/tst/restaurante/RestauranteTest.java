package restaurante;

import Restaurante.Bairro;
import Restaurante.Restaurante;
import Restaurante.RestauranteDAO;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RestauranteTest {

    private RestauranteDAO dao = new RestauranteDAO();

    @Before
    public void preparar() {
        dao.preparar();
    }

    @Test
    public void test() {
        List<Restaurante> restTest = dao.consultarRestaurantes();
        assertEquals(4, restTest.size());
    }

    @Test
    public void testConsultarPorBairroCentro() {
        List<Restaurante> restTest = dao.consultarRestaurantes(new Bairro("Centro"));
        assertEquals(2, restTest.size());
    }
    
    @Test
    public void testConsultarPorBairroAuxiliadora() {
        List<Restaurante> restTest = dao.consultarRestaurantes(new Bairro("Auxiliadora"));
        assertEquals(0, restTest.size());
    }
}
