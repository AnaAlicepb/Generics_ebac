public class Sedan extends Carro {
    public Sedan(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Sedan: " + getMarca() + " " + getModelo());
    }
}
