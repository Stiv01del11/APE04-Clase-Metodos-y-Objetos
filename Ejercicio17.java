public class Ejercicio17 {

    // Definición de la clase Cuenta con titular y saldo[cite: 8]
    public static class Cuenta {
        String titular;
        double saldo;

        public Cuenta(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        // Método transferir que recibe un objeto Cuenta como parámetro[cite: 8]
        public void transferir(Cuenta destino, double monto) {
            System.out.println("--- Intentando transferir $" + monto + " de " + this.titular + " a " + destino.titular + " ---");
            if (monto > 0 && this.saldo >= monto) {
                this.saldo -= monto;       // Retira el monto de la cuenta actual
                destino.saldo += monto;    // Deposita en la cuenta destino
                System.out.println("¡Transferencia exitosa!");
            } else {
                System.out.println("Transferencia fallida: Fondos insuficientes o monto no válido.");
            }
            mostrarDetalle();
            destino.mostrarDetalle();
            System.out.println();
        }

        // Método auxiliar para mostrar el estado de la cuenta
        public void mostrarDetalle() {
            System.out.println("Cuenta de " + titular + " | Saldo actual: $" + saldo);
        }
    }

    // Método principal para probar las transferencias (válida y fallida)[cite: 8]
    public static void main(String[] args) {
        // Crear 2 cuentas[cite: 8]
        Cuenta cuenta1 = new Cuenta("Carlos", 500.0);
        Cuenta cuenta2 = new Cuenta("Mateo", 150.0);

        cuenta1.mostrarDetalle();
        cuenta2.mostrarDetalle();
        System.out.println();

        // 1. Una transferencia válida[cite: 8]
        cuenta1.transferir(cuenta2, 200.0);

        // 2. Una transferencia que falle (saldo insuficiente)[cite: 8]
        cuenta2.transferir(cuenta1, 1000.0);
    }
}
