import java.util.Scanner;

public class Baggage {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba el número de pares de cubos de equipaje");
        int numPos = lector.nextInt();


        if (numPos == 3) {
            Baggage.escribirDireccion(2, -1, 0);
            Baggage.escribirDireccion(5, 2, 0);
            Baggage.escribirDireccion(3, -3, 0);
        } else {
            Baggage.ordenarCubiculos(numPos, 0);
        }

    }

    public static void escribirDireccion(int from, int to, int difPos) {
        System.out.println((from + difPos) + " to " + (to + difPos));
    }

    public static void ordenarCubiculos(int num, int difPosic) {
        if (num == 4) {
            Baggage.escribirDireccion(6, -1, difPosic);
            Baggage.escribirDireccion(3, 6, difPosic);
            Baggage.escribirDireccion(0, 3, difPosic);
            Baggage.escribirDireccion(7, 0, difPosic);
        } else if (num == 5) {
            Baggage.escribirDireccion(8, -1, difPosic);
            Baggage.escribirDireccion(3, 8, difPosic);
            Baggage.escribirDireccion(6, 3, difPosic);
            Baggage.escribirDireccion(0, 6, difPosic);
            Baggage.escribirDireccion(9, 0, difPosic);
        } else if (num == 6) {
            Baggage.escribirDireccion(10, -1, difPosic);
            Baggage.escribirDireccion(7, 10, difPosic);
            Baggage.escribirDireccion(2, 7, difPosic);
            Baggage.escribirDireccion(6, 2, difPosic);
            Baggage.escribirDireccion(0, 6, difPosic);
            Baggage.escribirDireccion(11, 0, difPosic);
        } else if (num == 7) {
            Baggage.escribirDireccion(8, -1, difPosic);
            Baggage.escribirDireccion(5, 8, difPosic);
            Baggage.escribirDireccion(12, 5, difPosic);
            Baggage.escribirDireccion(3, 12, difPosic);
            Baggage.escribirDireccion(9, 3, difPosic);
            Baggage.escribirDireccion(0, 9, difPosic);
            Baggage.escribirDireccion(13, 0, difPosic);
        } else {
            int numCub = 2 * num;
            Baggage.escribirDireccion(numCub - 2, -1, difPosic);
            Baggage.escribirDireccion(3, numCub - 2, difPosic);
            Baggage.ordenarCubiculos(num - 4, difPosic + 4);
            Baggage.escribirDireccion(0, numCub - 5, difPosic);
            Baggage.escribirDireccion(numCub - 1, 0, difPosic);
        }


    }
}


