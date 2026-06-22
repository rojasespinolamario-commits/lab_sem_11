import java.util.HashMap;

public class Moca extends Complemento {

    Cafe bebida;

    private static final HashMap<String, Double> precios = new HashMap<>();

    static {
        precios.put(Tamaño.N, 0.20);
        precios.put(Tamaño.M, 0.25);
        precios.put(Tamaño.G, 0.30);
    }

    public Moca(Cafe bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    @Override
    public String getTamaño() {
        return bebida.getTamaño();
    }

    public double costo() {
        return bebida.costo() + precios.get(bebida.getTamaño());
    }
}
