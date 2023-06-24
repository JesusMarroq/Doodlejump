  import edu.epromero.util.*;
  /**
 *
 * @author Usuario-16
 * ElementoGrafico: Da color, forma, posicion y sentido
 * a cada elemento de la pantalla
 */

/**
 * Class ElementoGrafico: Esta clase permite
 * gestionar todos los elementos que se pìntan 
 * en la pantalla
 * @author Usuario-16
 */
public class ElementosG {


    protected int cx; // coordenada en X
    protected int cy;
    protected int ancho;
    protected int alto;
    protected Imagen sprite;
    protected int compVert;
    protected int compHorz;

    /**
     * inicia: Este metodo permite iniciar los valores
     * de un objeto ElementoGrafico
     * @param micx : establece la coordenada en X
     * @param micy : establece la coordenada en Y
     * @param miancho
     * @param mialto
     * @param micompVert
     * @param micompHorz
     * @param recurso 
     */
    public void inicia(int micx,
                int micy,
                int miancho,
                int mialto,
                int micompVert,
                int micompHorz,
                String recurso){
        cx = micx;
        cy = micy;
        ancho = miancho;
        alto = mialto;
        compVert = micompVert;
        compHorz = micompHorz;
        sprite = new Imagen(recurso);
    }
    /**
     * Contructor por omision
     */
    public ElementosG(){
    
        inicia(0,0,1,1,1,1,"mario.jpg");
    }
    /**
     * Coordenada X
     * @return El valor entero de la coordenada X 
     */
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

    public Imagen getSprite() {
        return sprite;
    }

    public void setSprite(Imagen sprite) {
        this.sprite = sprite;
    }

    public int getCompVert() {
        return compVert;
    }

    public void setCompVert(int compVert) {
        this.compVert = compVert;
    }

    public int getCompHorz() {
        return compHorz;
    }

    public void setCompHorz(int compHorz) {
        this.compHorz = compHorz;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    /**
     * Establece una nueva imagen como sprite
     * @param nombreArchivo localizacion del archivo 
     */
    public void setImagen(String nombreArchivo){
        sprite = new Imagen(nombreArchivo);
    }
    
    public void pintar(){
        LienzoStd.dibujo(cx, cy, sprite);
    }
    
    public void mueve(){
        
    }
    
    
    
}

