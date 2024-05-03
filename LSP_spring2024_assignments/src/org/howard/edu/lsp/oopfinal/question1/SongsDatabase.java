package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();

    /* Method to add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        map.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    /* Method to retrieve the genre of a song title */
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; // Return null if the song title is not found
    }

    /* Method to retrieve the set of songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }
}

