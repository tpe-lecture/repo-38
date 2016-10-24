package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Sprite;
import de.smits_net.games.framework.sprite.Velocity;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {
// TODO: Von Board ableiten
    
    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien;

    /** Asteroid. */
    private Sprite asteroid;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
// TODO: Einkommentieren
        // neues Spielfeld anlegen
        super(15, new Dimension(800, 600), Color.BLACK);

        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");


        // TODO: Alien und Asteroid anlegen und positionieren
        Point locationAlien = new Point();
        locationAlien.setLocation(750, 300);
        Point locationAsteroid = new Point();
        locationAsteroid.setLocation(200, 400);
        alien = new AlienSprite(this, locationAlien);
        asteroid = new Asteroid (this, locationAsteroid);
        alien.setVisible(true);
    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
        // TODO: Alle Objekte zeichnen
        alien.draw(g);
        asteroid.draw(g);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        // TODO: Die Objekte bewegen
        asteroid.move();
        alien.move();
        
        // Kollision erkennen
        if (alien.intersects(asteroid) && alien.isActive()) {
            alien.explode();
        }

        return true;
    }
}
