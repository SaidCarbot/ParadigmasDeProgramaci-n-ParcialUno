/* Del ejercicio de laboratorio 1,
17 de septiembre de 2024
Ejercicio de Lab1: Programación estructurada parte I
Instrucciones: Parte I.
Elabora uno o varios programas que realice al menos 5 fórmulas de perímetros y áreas.
Los valores introducidos serán en m y tendrán que ser convertidos a cm. '''
* */
import java.util.Scanner;

public class areaAndperimetros
{
    public static void main(String[] args)
    {
        // Instrucciones:
        /* Parte I. Elabora uno o varios programas que realice al menos 5 fórmulas
        de perímetros y áreas.
        Los valores introducidos serán en m y tendrán que ser convertidos a cm.*/

        // Creamos el scanner para recibir datos del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Este es un programa que cálcula el área y el perímetro de 5 figuras\n");


        int i = -1;
        while (i != 0)
        {
            // Menú de opciones
            System.out.printf("Por favor selecciona el número " +
                    "de la figura con la cual deseas trabajar o 0 para salir:\n");
            System.out.printf("1. Círculo\n");
            System.out.printf("2. Cuadrado\n");
            System.out.printf("3. Rectángulo\n");
            System.out.printf("4. Triángulo\n");
            System.out.printf("5. Semicírculo\n");
            System.out.printf("0. Salir\n");
            int figura = scanner.nextInt();

            // Solo hasta que el usuario decida salir con 0
            if (figura == 0)
            {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (figura)
            {
                case 1: // Círculo
                    System.out.println("Ingresa el radio del círculo en metros:");
                    double radioMetros = scanner.nextDouble();
                    double radioCm = radioMetros * 100;//Convierto a metros
                    double areaCirculo = Math.PI * Math.pow(radioCm, 2);// Usando la clase Match y a su vez el método .PI
                    double perimetroCirculo = 2 * Math.PI * radioCm;
                    System.out.printf("El área del círculo es: %.2f cm^2\n", areaCirculo);
                    System.out.printf("El perímetro del círculo es: %.2f cm\n", perimetroCirculo);
                    break;

                case 2: // Cuadrado
                    System.out.println("Ingresa el lado del cuadrado en metros:");
                    double ladoMetros = scanner.nextDouble();
                    double ladoCm = ladoMetros * 100;// Convertir a cm
                    double areaCuadrado = Math.pow(ladoCm, 2);// usando la clase Math y el método pow
                    double perimetroCuadrado = 4 * ladoCm;
                    System.out.printf("El área del cuadrado es: %.2f cm^2\n", areaCuadrado);
                    System.out.printf("El perímetro del cuadrado es: %.2f cm\n", perimetroCuadrado);
                    break;

                case 3: // Rectángulo
                    System.out.println("Ingresa la base del rectángulo en metros:");
                    double baseMetros = scanner.nextDouble();
                    System.out.println("Ingresa la altura del rectángulo en metros:");
                    double alturaMetros = scanner.nextDouble();
                    double baseCm = baseMetros * 100;// Conversión a cm
                    double alturaCm = alturaMetros * 100;// Conversión a cm
                    double areaRectangulo = baseCm * alturaCm;
                    double perimetroRectangulo = 2 * (baseCm + alturaCm);
                    System.out.printf("El área del rectángulo es: %.2f cm^2\n", areaRectangulo);
                    System.out.printf("El perímetro del rectángulo es: %.2f cm\n", perimetroRectangulo);
                    break;

                case 4: // Triángulo
                    System.out.println("Ingresa la base del triángulo en metros:");
                    double baseTrianguloMetros = scanner.nextDouble();
                    System.out.println("Ingresa la altura del triángulo en metros:");
                    double alturaTrianguloMetros = scanner.nextDouble();
                    double baseTrianguloCm = baseTrianguloMetros * 100;// Conversión a cm
                    double alturaTrianguloCm = alturaTrianguloMetros * 100;// Conversión a cm
                    double areaTriangulo = (baseTrianguloCm * alturaTrianguloCm) / 2;
                    System.out.printf("El área del triángulo es: %.2f cm^2\n", areaTriangulo);
                    // El perímetro depende de si es equilátero o no, podrías pedir más datos
                    break;

                case 5: // Semicírculo
                    System.out.println("Ingresa el radio del semicírculo en metros:");
                    double halfradioMetros = scanner.nextDouble();
                    double halfradioCm = halfradioMetros * 100;//Convierto a metros
                    double halfareaCirculo = (Math.PI * Math.pow(halfradioCm, 2))/2;// Usando la clase Match y a su vez el método .PI
                    double halfperimetroCirculo = Math.PI * halfradioCm + halfradioCm*2;
                    System.out.printf("El área del círculo es: %.2f cm^2\n", halfareaCirculo);
                    System.out.printf("El perímetro del círculo es: %.2f cm\n", halfperimetroCirculo);
                    break;

                default:
                    System.out.println("Opción inválida, por favor intenta nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}
// Por Said Carbot y Elian, ESCOM-IPN-MEX