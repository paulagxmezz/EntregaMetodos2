import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassCastExceptionTest {
    public static <T> T cast(Object o, Class<T> a) throws MyClassCastException{
        if(a.isInstance(o)){
            return (T)o;
        }
        else{
            throw new MyClassCastException("El elemento: " + o + ", no puede ser casteado a la clase: " + a.getName());
        }
    }
    @Test
    public void testSinExcepciones() throws MyClassCastException {
        //Caso1: Number a Integer (Como hemos visto en la clase de prueba, debe funcionar)
        try{
            Number numero = 123;
            Integer resultado = MyClassCastExceptionTest.cast(numero, Integer.class);
            assertEquals(123, resultado);
            System.out.println("Me ejecuté correctamente");
        }
        catch(MyClassCastException e1){
            e1.printStackTrace();
        }
    }

    @Test
    public void testConExcepciones() throws MyClassCastException {
        // String a Integer (debe fallar)
        try{
            String texto = "123";
            MyClassCastExceptionTest.cast(texto, Integer.class);
            //Esto no se va a ejecutar nunca porque deberia de ocurrir una excepcion arriba
            System.out.println("Nunca saldré");
        }
        catch(MyClassCastException e2){
            e2.printStackTrace();
        }


    }

    @Test
    public void testConObjetoNull() {
        // Probar con objeto null y de paso probar que funcionan los mensajes de las excepciones
        try {
            MyClassCastExceptionTest.cast(null, Integer.class);
        } catch (MyClassCastException e) {
            String mensajeEsperado = "El elemento: null, no puede ser casteado a la clase: java.lang.Integer";
            assertEquals (mensajeEsperado, e.getMessage());
            e.printStackTrace();
        }
    }
}