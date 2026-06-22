import java.util.HashMap;

public class Crema extends Complemento {

    Cafe bebida;

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 0.10);
        precios.put(Tamaño.M, 0.15);
        precios.put(Tamaño.G, 0.20);
    }

    public Crema(Cafe bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public String getTamaño() {
        return bebida.getTamaño();
    }

    public double costo() {
        return bebida.costo() + precios.get(bebida.getTamaño());
    }
}
