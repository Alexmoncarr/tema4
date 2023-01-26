public class SmartWatch extends SmartDevice{
        private String sistemaOperativo;

        public SmartWatch() {
        }

        public SmartWatch(String marca, String modelo, double precio, String sistemaOperativo) {
            super(marca, modelo, precio);
            this.sistemaOperativo = sistemaOperativo;
        }

        public String getSistemaOperativo() {
            return sistemaOperativo;
        }

        public void setSistemaOperativo(String sistemaOperativo) {
            this.sistemaOperativo = sistemaOperativo;
        }
    }

