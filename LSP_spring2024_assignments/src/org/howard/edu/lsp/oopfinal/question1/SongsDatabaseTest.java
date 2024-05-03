//package name 
package org.howard.edu.lsp.oopfinal.question1; 

import static org.junit.jupiter.api.Assertions.*;

// libraries used down below
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {
    @Test
    @DisplayName("Test for ")
    public void testAddSong() {
        // Test adding a song to a genre
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage")); // should be True
    }

    @Test
    public void testGetGenreOfSong() {
        // Test that does retrieving the genre of a song
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));  // should be Equal
    }

    @Test
    public void testGetSongs() {
        // Test retrieving the set of songs for a genre
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        Set<String> expectedSongs = new HashSet<>(Arrays.asList("Savage", "Gin and Juice"));
        assertEquals(expectedSongs, db.getSongs("Rap")); // should be the same
    }
}
