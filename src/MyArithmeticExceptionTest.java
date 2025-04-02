public class MyArithmeticExceptionTest {
    public static double calculadoraDivisionSegura(double num1, double num2) throws MyArithmeticException {
        if (num2 == 0) {
            throw new MyArithmeticException("OJO!! estás dividiendo por 0, no puedo hacer eso :(");
        }
        return num1/num2;
    }
    public static void main(String[] args) throws MyArithmeticException {
        try{
            System.out.println(calculadoraDivisionSegura(3.7,2));
            System.out.println(calculadoraDivisionSegura(3.7,0));
        }
        catch(MyArithmeticException e){
            e.printStackTrace();
        }
    }
}
