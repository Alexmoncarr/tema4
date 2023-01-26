public class Smartphone extends SmartDevice{
        private int ram;
        private int almacenamiento;

        public Smartphone() {
        }

        public Smartphone(String marca, String modelo, double precio, int ram, int almacenamiento) {
            super(marca, modelo, precio);
            this.ram = ram;
            this.almacenamiento = almacenamiento;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getAlmacenamiento() {
            return almacenamiento;
        }

        public void setAlmacenamiento(int almacenamiento) {
            this.almacenamiento = almacenamiento;
        }
    }

