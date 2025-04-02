import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyIllegalStateExceptionTest {
    //Vamos a simular un "programa" bancario en el que se intentará realizar acciones sobre cuentas que no se encuentran en el estado apropiado:
    public static class Account{
        private boolean abierto;
        private int cantidad;
        public Account(boolean abierto, int cantidad) {
            this.abierto = abierto;
            this.cantidad = cantidad;
        }
        public void sacarDinero(int sacar) throws MyIllegalStateException{
            System.out.println("Accediendo a la cuenta para sacar: " + sacar + "EUROS.  ...");
            if(this.abierto == false){
                throw new MyIllegalStateException("Estado inválido, la cuenta está cerrada.");
            }
            else{
                cantidad -= sacar;
                System.out.println("Operación realizada con éxito.");
                System.out.println("La cantidad resultante es: " + cantidad + " EUROS.");
            }
        }
    }
    @Test
    public void testSinExcepciones() throws MyIllegalStateException{
        try {
            Account a = new Account(true, 5);
            a.sacarDinero(5);
        }
        catch(MyIllegalStateException e){
            e.printStackTrace();
        }
    }
    @Test
    public void testConExcepciones() throws MyIllegalStateException{
        try{
            Account a = new Account(false, 5);
            a.sacarDinero(5);
            System.out.println("Esto nunca se imprimira... :(");
        }
        catch(MyIllegalStateException e){
            e.printStackTrace();
        }
    }
}