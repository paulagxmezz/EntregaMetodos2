import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayIndexOutOfBoundsExceptionTest {
    public static void sustituir(int Indice, Object o, Object[] array) throws MyArrayIndexOutOfBoundsException {
        if (!(0<=Indice && Indice<array.length)) {
            throw new MyArrayIndexOutOfBoundsException("El indice: " + Indice + " ha de estar entre: 0 y " + (array.length-1));
        }
        else{
            array[Indice]=o;
        }
    }
    public static void add(Object o, Object[] array) throws MyArrayIndexOutOfBoundsException {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null) {
                array[i]=o;
                return;
            }
        }
        throw new MyArrayIndexOutOfBoundsException("El array ya está lleno, no se pueden añadir más elementos");
    }
    @Test
    public void testPrimero() throws MyArrayIndexOutOfBoundsException {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+"";
        }
        try{
            sustituir(5,"HAAaa",array);
            add("No puedo unirme :(",array);
        }
        catch(MyArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    @Test
    public void testSegundo() throws MyArrayIndexOutOfBoundsException {
        String[] array = new String[10];
        for (int i = 0; i < array.length-1; i++) {
            array[i]=i+"";
        }
        try {
            add("Ahora si puedo :)",array);
            sustituir(-2,"HAAaa",array);
        }
        catch(MyArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}