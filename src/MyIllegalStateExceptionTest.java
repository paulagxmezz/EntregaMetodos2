public class MyIllegalStateExceptionTest {
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
    public static void main(String[] args) {
        Account a1 = new Account(true,50);
        Account a2 = new Account(false,50);
        try{
            a1.sacarDinero(30);
            a2.sacarDinero(30);
        }
        catch(MyIllegalStateException e){
            e.printStackTrace();
        }
    }
}
