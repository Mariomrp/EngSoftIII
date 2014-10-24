package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {

    private List<Restaurante> resultado = new ArrayList<>();

    public List<Restaurante> consultarRestaurantes() {

        return resultado;
    }

    public void inserirRestaurante(String nome, String endereco, Bairro bairro) {
        Restaurante rest = new Restaurante(nome, endereco, bairro);
        resultado.add(rest);
    }

    public List<Restaurante> consultarRestaurantesBairro(Bairro bairro) {
        List<Restaurante> r = new ArrayList<>();
        for (Restaurante s : resultado) {
            if (s.getBairro().equals(bairro)) {
                r.add(s);
            }
        }

        return r;
    }

    public List<Restaurante> consultarRestaurantesNome(String nome) {
        List<Restaurante> r = new ArrayList<>();
        for (Restaurante s : resultado) {
            if (s.getNome().equals(nome)) {
                r.add(s);
            }
        }

        return r;
    }

    public void preparar() {
        Bairro b1 = new Bairro("Azenha");
        Bairro b2 = new Bairro("Centro");
        inserirRestaurante("Restaurante QWET","Rua A, nº1", b1);
        inserirRestaurante("Restaurante #$%&","Rua B, nº2", b1);
        inserirRestaurante("Restaurante ABC","Rua C, nº3", b2);
        inserirRestaurante("Restaurante 123","Rua D, nº4", b2);
    }
}
