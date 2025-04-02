import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNullPointerExceptionTest {
    public static void comprobar(Object obj) throws MyNullPointerException{
        if(obj == null){
            throw new MyNullPointerException("!!! El objeto es nulo");
        }
    }
    @Test
    public void test() throws MyNullPointerException{
        String[] array = new String[2];
        array[0] = "Hola";
        try{
            for(int i=0;i<array.length;i++){
                comprobar(array[i]);
                System.out.println(array[i]);
            }
        }
        catch(MyNullPointerException e){
            e.printStackTrace();
        }
    }

}