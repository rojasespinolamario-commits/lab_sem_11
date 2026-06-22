public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la Cafeteria");
        System.out.println();

        Cafe bebida = new Expreso();
        bebida.setTamaño(Tamaño.G);

        bebida = new Leche(bebida);
        bebida = new Soya(bebida);
        bebida = new Crema(bebida);
        bebida = new Moca(bebida);
        System.out.println(bebida.getDescripcion() + "\nTamaño: " + bebida.getTamaño() + "\nTotal: $" + bebida.costo());
        System.out.println();

        Cafe bebida2 = new Descafeinado();
        bebida2.setTamaño(Tamaño.M);

        bebida2 = new Moca(bebida2);
        bebida2 = new Moca(bebida2);
        bebida2 = new Soya(bebida2);
        bebida2 = new Leche(bebida2);
        System.out.println(bebida2.getDescripcion() + "\nTamaño: " + bebida2.getTamaño() + "\nTotal: $" + bebida2.costo());
        System.out.println();

        Cafe bebida3 = new Batido();
        bebida3.setTamaño(Tamaño.N);

        bebida3 = new Crema(bebida3);
        bebida3 = new Crema(bebida3);
        bebida3 = new Leche(bebida3);
        bebida3 = new Leche(bebida3);
        bebida3 = new Soya(bebida3);
        bebida3 = new Soya(bebida3);
        bebida3 = new Moca(bebida3);
        bebida3 = new Moca(bebida3);
        System.out.println(bebida3.getDescripcion() + "\nTamaño: " + bebida3.getTamaño() + "\nTotal: $" + bebida3.costo());
        System.out.println();

        Cafe bebida4 = new TostadoNegro();
        bebida4.setTamaño(Tamaño.N);

        bebida4 = new Crema(bebida4);
        bebida4 = new Crema(bebida4);
        bebida4 = new Soya(bebida4);
        bebida4 = new Soya(bebida4);
        bebida4 = new Soya(bebida4);
        System.out.println(bebida4.getDescripcion() + "\nTamaño: " + bebida4.getTamaño() + "\nTotal: $" + bebida4.costo());
    }
}