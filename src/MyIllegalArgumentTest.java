import java.util.Objects;

public class MyIllegalArgumentTest {
    public static void TestNumerosPositivos (float[] args) throws MyIllegalArgumentException { //Un test para validar la que la entrada sean números y positivos:
        for (int i = 0; i < args.length; i++) {
            if(args[i] < 0){
                throw new MyIllegalArgumentException("Excepción en el argumento: " + args[i] + " < 0");
            }
        }
    }
    public static void main(String[] args) {
        try{
            float[] array = new float[5];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
            array[4] = -5;
            TestNumerosPositivos(array);
        }
        catch (MyIllegalArgumentException ex){
            ex.printStackTrace();
        }
    }
}
