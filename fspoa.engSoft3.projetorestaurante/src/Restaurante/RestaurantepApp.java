package Restaurante;


import java.io.IOException;
import java.util.List;

public class RestaurantepApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Projeto Restaurante.");
		
		System.out.println("Criando dados de teste...\n\n");
		RestauranteDAO dao = new RestauranteDAO();
		dao.inserirRestaurante("Restaurante ABC", new Bairro("Centro"));
		System.out.println(dao.consultarRestaurantes());
		
	}
}
