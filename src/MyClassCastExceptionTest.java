public class MyClassCastExceptionTest {
    public static <T> T cast(Object o, Class<T> a) throws MyClassCastException{
        if(a.isInstance(o)){
            return (T)o;
        }
        else{
            throw new MyClassCastException("El elemento: " + o + ", no puede ser casteado a la clase: " + a.getName());
        }
    }
    public static void main(String[] args) {
        try{
            Number o = 123; //Este caso si se puede castear, pues solo se pueden castear si tienen una relaciond e herencia (integer es una instancia de number, al ser una clase "padre" de integer)
            System.out.println("El casteo fue exitoso: " + (cast(o, Integer.class) + " = " + o));
            String s = "123"; //Este caso va a lanzar una excepción, pues no hay una relacion de herncia entre String e Integer
            System.out.println("El casteo fue exitoso:" + (cast(s, Integer.class)) + "=" + s);

        }
        catch(MyClassCastException e){
            e.printStackTrace();
        }
    }
}
