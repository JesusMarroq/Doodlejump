import edu.epromero.util.*;

public class Heroe extends Juego {
    private int cx;
    private int cy;
   
    private int medioAncho;
    private int largo;
    private Imagen img;

    void Inicia(int miCx,int miCy,int elMedioAncho, String miImg)
    {
        setCx(miCx);setCy(miCy);
        
//        img = new Imagen("dood.jpg");
        setMedioAncho(elMedioAncho);
    }
    Heroe()
    {
        Inicia(0,
                (int)LienzoStd.pideLimiteYMax(),
                10,
                "doodle.png");
    }        
    void Pinta()
    {
        
        LienzoStd.RectanguloLleno(cx, cy, medioAncho,30);
    }   
//    void Mover(Pelota laPelota)
//    {
//       setCy((int)LienzoStd.ratonY());
//    }        
    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }


    public int getMedioAncho() {
        return medioAncho;
    }

    public void setMedioAncho(int medioAncho) {
        this.medioAncho = medioAncho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Imagen getImg() {
        return img;
    }

    public void setImg(Imagen img) {
        this.img = img;
    }
     
}
