import java.util.HashMap;

public class TostadoNegro extends Cafe {

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 0.99);
        precios.put(Tamaño.M, 1.09);
        precios.put(Tamaño.G, 1.19);
    }

    public TostadoNegro () {
        descripcion = "Tostado Negro";
    }

    @Override
    public double costo() {
        return precios.get(tamaño);
    }

}
