public abstract class Cafe {

    String descripcion = "";
    String tamaño = Tamaño.N;

    public String getDescripcion() {
        return descripcion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public abstract double costo();
}
