public class calculadoragit {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int numero1;
        int numero2;
        int total;
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. Multiplicar");
        System.out.println("5. Salir");
        respuesta = sc.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("Dime el primer numero");
                numero1 = sc.nextInt();
                System.out.println("Dime el segundo numero");
                numero2 = sc.nextInt();
                total = numero1 + numero2;
                System.out.println("El total de " +numero1+ " + " +numero2+ " = " +total);
            case 2:
                System.out.println("Dime el primer numero");
                numero1 = sc.nextInt();
                System.out.println("Dime el segundo numero");
                numero2 = sc.nextInt();
                total = numero1 - numero2;
                System.out.println("El total de " +numero1+ " - " +numero2+ " = " +total);
            case 3:

        }

    }
}
