

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse Speichern.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Speichern
{
    private Schueler anna;
    private Schueler erik;
    private Schueler fabui;
    private Schueler colin;
    private Schueler charlotte;
    private Schueler helena;
    private Schule gsg;
    private Klasse Elefanten;
    private Lehrer kleinhans;
    private Lehrer dietrich;
    private Fach englisch;
    private Fach mathe;
    private Fach sport;

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    

    /**
     * Konstruktor fuer die Test-Klasse Speichern
     */
    public Speichern()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
        anna = new Schueler();
        erik = new Schueler();
        fabui = new Schueler();
        colin = new Schueler();
        charlotte = new Schueler();
        helena = new Schueler();
        gsg = new Schule();
        Elefanten = new Klasse();
        kleinhans = new Lehrer();
        dietrich = new Lehrer();
        erik.setName("Erik");
        charlotte.setName("Charlotte");
        helena.setName("Helena");
        fabui.setName("Fabui");
        colin.setName("Colin");
        dietrich.setName("Aaron Dietrich");
        Elefanten.setName("10B");
        gsg.setName("Geschwister-Scholl-Gymnasium");
        anna.setName("Anna");
        kleinhans.setName("S. Kleinhans");
        gsg.addStudent(erik);
        gsg.addStudent(charlotte);
        gsg.addStudent(helena);
        gsg.addStudent(fabui);
        gsg.addStudent(colin);
        gsg.addStudent(anna);
        Elefanten.addStudent(erik);
        Elefanten.addStudent(charlotte);
        Elefanten.addStudent(helena);
        Elefanten.addStudent(fabui);
        Elefanten.addStudent(colin);
        Elefanten.addStudent(anna);
        Elefanten.addTeacher(kleinhans);
        Elefanten.addTeacher(dietrich);
        englisch = new Fach();
        mathe = new Fach();
        sport = new Fach();
        englisch.addTeacher(kleinhans);
        englisch.addTeacher(dietrich);
        sport.addTeacher(dietrich);
        mathe.addTeacher(kleinhans);
        gsg.addTeacher(dietrich);
        gsg.addTeacher(kleinhans);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
