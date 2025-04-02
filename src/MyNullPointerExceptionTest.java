public class MyNullPointerExceptionTest {
    public static void comprobar(Object obj) throws MyNullPointerException{
        if(obj == null){
            throw new MyNullPointerException("!!! El objeto es nulo");
        }
    }
    public static void main(String[] args) throws MyNullPointerException{
        Integer[] array = new Integer[10];
        for(int i = 0; i < array.length-1; i++){
            array[i] = i;
        }
        try{
            for(int i = 0; i < array.length; i++){
                comprobar(array[i]);
                System.out.println(array[i]);
            }
        }
        catch(MyNullPointerException e){
            e.printStackTrace();
        }
    }
}
