import java.util.HashMap;

public class Expreso extends Cafe {

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 1.99);
        precios.put(Tamaño.M, 2.09);
        precios.put(Tamaño.G, 2.15);
    }

    public Expreso () {
        descripcion = "Cafe expreso";
    }

    @Override
    public double costo() {
        return precios.get(tamaño);
    }
}
