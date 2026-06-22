import java.util.HashMap;

public class Batido extends Cafe {

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 0.89);
        precios.put(Tamaño.M, 0.99);
        precios.put(Tamaño.G, 1.09);
    }

    public Batido () {
        descripcion = "Batido";
    }

    @Override
    public double costo() {
        return precios.get(tamaño);
    }

}
