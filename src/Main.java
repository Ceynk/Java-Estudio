import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int intentos = 0;
        int nos;
        Scanner sc = new Scanner(System.in);
        double dinero = 2000;
        String numeroDeCuenta = "77889966";
        int pin;
        String nombre;
        int intentoso = 0;
        boolean algo = false;

        System.out.println("Ingrese su nombre y password");
        nombre = sc.next();
        System.out.println("Hola " + nombre);


        while (intentoso < 3) {
            System.out.print("Ingrese su pin: ");
            pin = sc.nextInt();
            if (pin == 123456) {
                System.out.println("Contraseña Correcta");
                intentoso += 4;
                algo = true;
            } else {
                System.out.println("Contraseña Incorrecta");
                intentoso++;
                algo = false;
            }

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
                case 4:
                    break;
            }
        } else {
            System.out.println("No hay su monto de dinero");
        }

    }
}