import java.util.Scanner;

public class BaggageMejorado {
    public static String[] arregloEquipaje;
    public static int posIni;
    public static int numPosFi;
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba el número de pares de cubos de equipaje");
        int numPos = lector.nextInt();
        arregloEquipaje = new String[numPos*4];
        posIni = numPos*2;
        numPosFi = numPos*4;
        for(int i = 0; i<numPosFi; i+=1)
        {
            if(i >= posIni) {
                if (i == posIni) {
                    arregloEquipaje[i] = "B";
                } else if (i % 2 != 0) {
                    arregloEquipaje[i] = "A";
                } else {
                    arregloEquipaje[i] = "B";
                }
            }
            else
            {
                arregloEquipaje[i] = ".";
            }
        }
        BaggageMejorado.imprimirCambio();

        if(numPos == 3)
        {
            BaggageMejorado.escribirDireccion(2, -1, 0);
            BaggageMejorado.escribirDireccion(5, 2, 0);
            BaggageMejorado.escribirDireccion(3, -3, 0);
        }
        else
        {
            BaggageMejorado.ordenarCubiculos(numPos, 0);
        }

    }

    public static void escribirDireccion(int from, int to, int difPos)
    {
        System.out.println((from + difPos) + " to " + (to + difPos));
        BaggageMejorado.cambiarPosiciones((from+difPos-1+posIni), (to+difPos-1+posIni));
    }

    public static void ordenarCubiculos(int num, int difPosic)
    {
        if(num == 4)
        {
            BaggageMejorado.escribirDireccion(6, -1, difPosic);
            BaggageMejorado.escribirDireccion(3, 6, difPosic);
            BaggageMejorado.escribirDireccion(0, 3, difPosic);
            BaggageMejorado.escribirDireccion(7, 0, difPosic);
        }
        else if(num == 5)
        {
            BaggageMejorado.escribirDireccion(8, -1, difPosic);
            BaggageMejorado.escribirDireccion(3, 8, difPosic);
            BaggageMejorado.escribirDireccion(6, 3, difPosic);
            BaggageMejorado.escribirDireccion(0, 6, difPosic);
            BaggageMejorado.escribirDireccion(9, 0, difPosic);
        }

        else if(num == 6)
        {
            BaggageMejorado.escribirDireccion(10, -1, difPosic);
            BaggageMejorado.escribirDireccion(7, 10, difPosic);
            BaggageMejorado.escribirDireccion(2, 7, difPosic);
            BaggageMejorado.escribirDireccion(6, 2, difPosic);
            BaggageMejorado.escribirDireccion(0, 6, difPosic);
            BaggageMejorado.escribirDireccion(11, 0, difPosic);
        }

        else if(num == 7)
        {
            BaggageMejorado.escribirDireccion(8, -1, difPosic);
            BaggageMejorado.escribirDireccion(5, 8, difPosic);
            BaggageMejorado.escribirDireccion(12, 5, difPosic);
            BaggageMejorado.escribirDireccion(3, 12, difPosic);
            BaggageMejorado.escribirDireccion(9, 3, difPosic);
            BaggageMejorado.escribirDireccion(0, 9, difPosic);
            BaggageMejorado.escribirDireccion(13, 0, difPosic);
        }
        else
        {
            int numCub = 2 * num;
            BaggageMejorado.escribirDireccion(numCub - 2, -1, difPosic);
            BaggageMejorado.escribirDireccion(3, numCub - 2, difPosic);
            BaggageMejorado.ordenarCubiculos(num - 4, difPosic + 4);
            BaggageMejorado.escribirDireccion(0, numCub - 5, difPosic);
            BaggageMejorado.escribirDireccion(numCub - 1, 0, difPosic);
        }


    }

    public static void cambiarPosiciones(int num, int num2)
    {
        arregloEquipaje[num2] = arregloEquipaje[num];
        arregloEquipaje[num] = ".";
        arregloEquipaje[num2+1] = arregloEquipaje[num+1];
        arregloEquipaje[num+1] = ".";
        imprimirCambio();
    }

    public static void imprimirCambio()
    {
        String cubosDeEquipaje= "";
        for(int i = 0; i < numPosFi; i+=1)
        {
            cubosDeEquipaje = cubosDeEquipaje + arregloEquipaje[i];
        }
        System.out.println(cubosDeEquipaje);
    }
}