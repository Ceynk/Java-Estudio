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

        if (algo == true) {
            System.out.print("Ingrese una opcion ");
            nos = sc.nextInt();

            switch (nos) {
                case 1:
                    System.out.print("Su monto de dinero: " + dinero);
                    break;

                case 2:
                    System.out.print("Cuanto desea ingresar? ");
                    double monto = sc.nextInt();
                    dinero += monto;
                    System.out.print("Su monto de dinero: " + dinero);
                    break;

                case 3:
                    System.out.print("Cuanto desea retirar? ");
                    double retirar = sc.nextDouble();
                    if (retirar > dinero) {
                        System.out.println("No puede retirar mas dinero que el que tiene. ");
                    } else {
                        dinero -= retirar;
                    }
                    System.out.print("Su monto de dinero: " + dinero);
                    break;
                    case 4: break;
            }
        }

        else {
            System.out.println("No hay su monto de dinero");
        }

    }
}