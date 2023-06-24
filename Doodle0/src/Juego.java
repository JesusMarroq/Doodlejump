import edu.epromero.util.LienzoStd;

public class Juego {
    
    private Plataforma plaformamov;
    private ElementosG[] sprites = new ElementosG[1];
    Juego(){
        //Creo cada objeto del juego
        plaformamov = new Plataforma();
        //Asigno los elementos polimorficos
        sprites[0] = plaformamov;
        inicia();
    }
    
    void inicia(){
        //Establece la escala de la ventana
    LienzoStd.ponEscalaX(0,256);
    LienzoStd.ponEscalaY(0,256);
    }
    
    void mueve(){
        int i;
        // Mueve todos los elementos que se mueven
        for(i = 0; i < sprites.length; i++)
            sprites[i].mueve();
    }
    
    void pinta(){
        int i;
        // Pinta todos los elementos que se mueven
        for(i = 0; i < sprites.length; i++)
            sprites[i].pintar();
    }
    void borra(){
        LienzoStd.limpia();
    }
}

