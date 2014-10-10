package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {

    private List<Restaurante> resultado = new ArrayList<>();

    public List<Restaurante> consultarRestaurantes() {

        return resultado;
    }

    public void inserirRestaurante(String nome, Bairro bairro) {
        Restaurante rest = new Restaurante(nome, bairro);
        resultado.add(rest);
    }

    public List<Restaurante> consultarRestaurantes(Bairro bairro) {
        List<Restaurante> r = new ArrayList<>();
        for(Restaurante s : resultado)
            if (s.getBairro().equals(bairro))
                r.add(s);
        
        return r;
    }
    
    public void preparar() {
        Bairro b1 = new Bairro("Azenha");
        Bairro b2 = new Bairro("Centro");
        inserirRestaurante("Restaurante QWET", b1);
        inserirRestaurante("Restaurante #$%&", b1);
        inserirRestaurante("Restaurante ABC", b2);
        inserirRestaurante("Restaurante 123", b2);
    }
    
}
