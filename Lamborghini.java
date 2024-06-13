public class Lamborghini extends Carro {
    public Lamborghini(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Lamborghini: " + getMarca() + " " + getModelo());
    }
}
