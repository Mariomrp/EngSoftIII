package Restaurante;

public class Restaurante {

    private String nome;
    private String endereco;
    private Bairro bairro;

    public Restaurante(String nome, String endereco, Bairro bairro) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public Bairro getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return nome + ", Endereço: " + endereco + ", Bairro: " + bairro;
    }
}
