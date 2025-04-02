import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MyArchivoInexistente_IOExceptionTest {
    public static void leerArchivo(String ruta) throws MyArchivoInexistente_IOException{
        File file = new File(ruta);
        System.out.println("Buscando el archivo con ruta: "+ruta + "  ...");
        if(!(file.exists())){
            throw new MyArchivoInexistente_IOException("El archivo con ruta: " + ruta + " no existe.");
        }
    }
    @Test
    public void test() throws MyArchivoInexistente_IOException{
        try{
            leerArchivo("Soy/Una/Ruta/Inexistente");
        }
        catch(MyArchivoInexistente_IOException e){
            e.printStackTrace();
        }
    }
}