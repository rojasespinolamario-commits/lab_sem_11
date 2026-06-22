import java.util.HashMap;

public class Descafeinado extends Cafe {

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 1.05);
        precios.put(Tamaño.M, 1.15);
        precios.put(Tamaño.G, 1.25);
    }

    public Descafeinado () {
        descripcion = "Descafeinado";
    }

    @Override
    public double costo() {
        return precios.get(tamaño);
    }
}
