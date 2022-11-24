public class practicaStrings {
    import java.util.Scanner
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int respuesta=0;
        String frase;
        System.out.println("Bienvenido al menu");
        System.out.println("1. Elimina espacios en blanco");
        System.out.println("2. Invierte cadena");
        System.out.println("3. Concatena dos cadenas");
        System.out.println("4. Busca una subcadena");
        System.out.println("5. Mayusculas");
        System.out.println("6. Minusculas");
        System.out.println("7. Salir");
        respuesta=sc.nextInt();
        System.out.println("Dime una frase");
        frase=sc.nextLine();
        switch (respuesta)
        {
            case 1:
                System.out.println(frase.replace(" ",""));
            case 2:
                int k;
                int i;
                k=frase.length();
                for (i=k;i>=0;i--)
                {
				System.out.println(frase.charAt(i));
			}
            case 3:
                System.out.println("Dime otra frase");
                String frase2=sc.nextLine();
                System.out.println(frase+frase2);
            case 4:
                System.out.println("Introduce lo que quieras buscar");
                String subcadena=sc.next();
                System.out.println(subcadena);
            case 5:
                System.out.println(frase.toUpperCase());
            case 6:
                System.out.println(frase.toLowerCase());
            case 7:
                System.out.println("chaoo");
                break;
        }
    }

}
}
