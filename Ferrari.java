public class Ferrari extends Carro {
    public Ferrari(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ferrari: " + getMarca() + " " + getModelo());
    }
}
