public class MyArrayIndexOutOfBoundsExceptionTest {
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
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        try{
            sustituir(7,23,array);
            System.out.println("Se ha sustituido el elemento correctamente");
            sustituir(10,2,array);
            System.out.println("Esto tampoco se imprimirá nunca");
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
