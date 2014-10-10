package Restaurante;

public class Restaurante {

    private String nome;
    private Bairro bairro;

    public Restaurante(String nome, Bairro bairro) {
        super();
        this.nome = nome;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public Bairro getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return nome + ", Bairro: " + bairro;
    }
}
