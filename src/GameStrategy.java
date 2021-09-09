import java.util.Scanner;
public class GameStrategy
{
    private static String[] arregloEquipaje;
    public static int numPosFi;
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el número de posiciones");
        int numPos = input.nextInt();
        numPosFi = numPos*4;
        arregloEquipaje = new String[numPosFi];
        int posIni = ((numPos*2));

        for(int i = posIni; i<numPosFi; i+=1)
        {
            if(i == posIni)
            {
                arregloEquipaje[i] = "B";
            }
            else if(i%2 != 0)
            {
                arregloEquipaje[i] = "A";
            }
            else
            {
                arregloEquipaje[i] = "B";
            }
        }
        String cubosDeEquipaje = "";
        for(int i = posIni; i < numPosFi; i+=1)
        {
            cubosDeEquipaje = new String(cubosDeEquipaje + arregloEquipaje[i]);
        }
        System.out.println(cubosDeEquipaje);
        System.out.println(arregloEquipaje.length);
        System.out.println(posIni);

        int ultPosCam = 0;

        for(int i = 0; i < posIni; i++)
        {

        }
    }

    public static void cambiarPosiciones(int num, int num2)
    {
        arregloEquipaje[num2] = arregloEquipaje[num];
        arregloEquipaje[num] = "";
        arregloEquipaje[num2+1] = arregloEquipaje[num+1];
        arregloEquipaje[num+1] = "";
    }

    public static int entregarUltAB(int numPosAlej)
    {
        for(int i = numPosFi - (2+numPosAlej); i > 0; i--)
        {
            if(arregloEquipaje[i]=="A")
            {
                if (arregloEquipaje[i+1]=="B")
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
