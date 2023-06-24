
import edu.epromero.util.LienzoStd;


public class Doodle0 {
public static void main(String[] args) throws InterruptedException{
       LienzoStd.ponEscala(50, 50);
        LienzoStd.mostrar();
        
//       ElementosG prueba = new ElementosG();
//        Thread.sleep(10);
//       prueba.setImagen("doodle.png");
//       prueba.pintar();

       
       Heroe pedro = new Heroe();
     pedro.pinta();
       
       Juego doo = new Juego();
        while(true){
            doo.mueve();
            doo.pinta();
            LienzoStd.mostrar(0);
            Thread.sleep(50);
            doo.borra();
        }
                
    }
    
}