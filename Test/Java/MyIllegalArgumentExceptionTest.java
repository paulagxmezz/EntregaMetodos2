import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyIllegalArgumentExceptionTest {
    public static void TestNumerosPositivos (float[] args) throws MyIllegalArgumentException { //Un test para validar la que la entrada sean números y positivos:
        for (int i = 0; i < args.length; i++) {
            if(args[i] < 0){
                throw new MyIllegalArgumentException("Excepción en el argumento: " + args[i] + " < 0");
            }
        }
        System.out.println("El argumento es válido");
    }
    @Test
    public void TestConExcepciones() throws MyIllegalArgumentException {
        try{
            float[] args = new float[2];
            args[0] = 0;
            args[1] = -5;
            TestNumerosPositivos(args);
        }
        catch(MyIllegalArgumentException e){
            e.printStackTrace();
        }


    }
    @Test
    public void TestSinExcepciones() throws MyIllegalArgumentException {
        try{
            float[] args = new float[2];
            args[0] = 3;
            args[1] = 0;
            TestNumerosPositivos(args);
        }
        catch(MyIllegalArgumentException e){
            e.printStackTrace();
        }


    }
}