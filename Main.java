import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        // Adicionando diferentes tipos de carros à lista
        carros.add(new Sedan("Civic", "Honda"));
        carros.add(new Ferrari("F8 Tributo", "Ferrari"));
        carros.add(new Lamborghini("Aventador", "Lamborghini"));
        

        // Exibindo informações dos carros na lista
        for (Carro carro : carros) {
            carro.exibirInfo();
        }
    }
}
