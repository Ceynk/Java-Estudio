import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int nos;
        Scanner sc = new Scanner(System.in);
        double dinero = 2000;
        String numeroDeCuenta = "77889966";
        int pin;
        String nombre;

        boolean algo;

        System.out.println("Ingrese su nombre y password");
        nombre = sc.next();
        System.out.println("Hola " + nombre);
        System.out.print("Ingrese su pin: ");
        pin = sc.nextInt();

        if (pin == 123456) {
            System.out.println("Accesso Exitoso");
            algo = true;

        } else {
            System.out.println("Accesso Denegado");
            algo = false;
        }
        System.out.print("Ingrese una opcion ");
        nos = sc.nextInt();
        if (algo == true) {
            switch (nos) {
                case 1:
                    System.out.print("Ingrese su nombre y password: ");
                break;
            }
        }

    }
}