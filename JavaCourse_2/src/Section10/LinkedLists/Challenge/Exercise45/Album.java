package Section10.LinkedLists.Challenge.Exercise45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    public boolean addSong (String song, double songDuration) {

        if (findSong(song) == null) {
            this.songs.add(new Song(song, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong (String song) {
        for (Song s : songs) {
            if (song.equals(s.getTitle())) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int index, LinkedList<Song> playlist) {
        // index -=1;
        System.out.println("Size " + playlist.size() + " index = " + index);
        System.out.println(playlist);
        if (!(index >= 0 && index < this.songs.size())) {
            return false;
        }
        System.out.println("List of songs -> " + this.songs);
        System.out.println("The song -> " + this.songs.get(index));

        Song tmpSong = this.songs.get(index);
//        if (findSong(tmpSong.getTitle()) == null) {
//            return false;
//        }
        playlist.add (this.songs.get(index));
        return true;
    }

    public boolean addToPlayList (String song, LinkedList<Song> playlist) {
        if (findSong(song) == null) {
            return false;
        }
        playlist.add(findSong(song));
        return true;
    }


}
