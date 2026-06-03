import model.Caja;
import model.Par;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n=== PRÁCTICA DE CLASES GENÉRICAS ===\n");

        System.out.println("--- Uso de Caja<T> ---");
        Caja<String> cajaS = new Caja<>("Hola mundo");
        Caja<Integer> cajaN= new Caja<>(100);
        Caja<Double> cajaD = new Caja<>(9.75);
        System.out.println("Caja de texto: " + cajaS.getT());
        System.out.println("Caja de entero: " + cajaN.getT());
        System.out.println("Caja de decimal: " + cajaD.getT());
        System.out.println("¿La caja de texto está vacía?: " + cajaS.estaVacia());
        System.out.println();

        System.out.println("--- Uso de Par<K, V> ---\n");
        Par<Integer, String> par1 = new Par<>(1, "Juan Pérez");
        Par<String, Integer> par2 = new Par<>("Edad", 20);
        Par<String, Double> par3 = new Par<>("Promedio", 8.75);
        System.out.println("Clave: " + par1.getClave() + " | Valor: " + par1.getValor());
        System.out.println("Clave: " + par2.getClave() + " | Valor: " + par2.getValor());
        System.out.println("Clave: " + par3.getClave() + " | Valor: " + par3.getValor());
        System.out.println();
    }
}
