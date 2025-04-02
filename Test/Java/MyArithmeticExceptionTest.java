import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArithmeticExceptionTest {
    public static double calculadoraDivisionSegura(double num1, double num2) throws MyArithmeticException {
        if (num2 == 0) {
            throw new MyArithmeticException("OJO!! estás dividiendo por 0, no puedo hacer eso :(");
        }
        return num1/num2;
    }
    @Test
    public void testConExcepcion() throws MyArithmeticException {
        try{
            calculadoraDivisionSegura(1,0);
        }
        catch(MyArithmeticException e){
            e.printStackTrace();
        }
    }
    @Test
    public void testSinExcepcion() throws MyArithmeticException {
        try{
            assertEquals(calculadoraDivisionSegura(0,1),0);
            System.out.println("Se dividió con éxito");
        }
        catch(MyArithmeticException e){
            e.printStackTrace();
        }
    }
}