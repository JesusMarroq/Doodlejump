import edu.epromero.util.*;


public class Plataforma extends ElementosG {
 
    public static final double DERECHA=1;
    public static final double IZQUIERDA= -1;
    public static final double ARRIBA = 1;
    public static final double ABAJO = -1;
//    private double componenteHor;
//    private double componenteVer;
     private boolean VoyPaLaDerecha;
     private boolean VoyPaBajo;
     private int medioAncho;
    
    public Plataforma()
            {
                setImagen("platform.png");
                
            }    
 
public boolean isVoyPaLaDerecha() {
        return VoyPaLaDerecha;
    }

    public void setVoyPaLaDerecha(boolean VoyPaLaDerecha) {
        this.VoyPaLaDerecha = VoyPaLaDerecha;
    }

    public boolean isVoyPaBajo() {
        return VoyPaBajo;
    }

    public void setVoyPaBajo(boolean VoyPaBajo) {
        this.VoyPaBajo = VoyPaBajo;
    }
      public int getMedioAncho() {
        return medioAncho;
    }

    public void setMedioAncho(int medioAncho) {
        this.medioAncho = medioAncho;
    }
    
       public void mueve(){
        if(this.isVoyPaLaDerecha()){
            cx+=10;
            if(((cx+1)+this.medioAncho)>LienzoStd.pideLimiteXMax()){
                setVoyPaLaDerecha(false);
            }
        }
        else
        {
            cx-=10;
            if(((cx-1)-this.medioAncho)<LienzoStd.pideLimiteXMin()){
                setVoyPaLaDerecha(true);
            }
        }
//        if(this.isVoyPaBajo()){
//            cy+=10;
//            if(((cy+1)+this.medioAncho)>LienzoStd.pideLimiteYMax()){
//                setVoyPaBajo(false);
//            }
//        }
//        else
//        {
//            cy-=10;
//            if(((cy-1)-this.medioAncho)<LienzoStd.pideLimiteYMin()){
//                setVoyPaBajo(true);
//            }
//        }
    }

}



