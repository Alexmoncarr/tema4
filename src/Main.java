public class Main {
    public static void main(String[] args) {
        Smartphone miTelefono = new Smartphone("Samsung", "Galaxy S21", 800, 8, 128);
        SmartWatch miReloj = new SmartWatch("Apple", "Watch Series 6", 400, "watchOS 7");

        System.out.println("Telefono: ");
        System.out.println("Marca: " + miTelefono.getMarca());
        System.out.println("RAM: " + miTelefono.getRam());
        System.out.println("Almacenamiento: " + miTelefono.getAlmacenamiento());


    }
}