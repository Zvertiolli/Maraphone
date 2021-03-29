package day12.Task5;


import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<MusicBand> musicBandArrayList = new ArrayList<>();

        MusicBand beatles = new MusicBand("The Beatles", 1960);
        MusicBand door = new MusicBand("Doors", 1965);

        musicBandArrayList.add(beatles);
        musicBandArrayList.add(door);

//        musicBandArrayList.add(new MusicBand("The Rolling Stones", 1962));
//        musicBandArrayList.add(new MusicBand("Queen", 1973));
//        musicBandArrayList.add(new MusicBand("Deep Purple", 1968));


        ArrayList<MusicArtist> members1 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Ringo Star", 52),
                new MusicArtist("Jon Lennon", 78)));

        musicBandArrayList.get(0).printMembers();

        //musicBandArrayList.get(1).setMembers(new ArrayList<>(Arrays.asList("Jon Lennon", "Ringo Star")));
        // musicBandArrayList.get(1).setMembers(new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Jon Lennon",25),new MusicArtist("Ringo Star", 41))));
        musicBandArrayList.get(0).setMembers(members1);
        musicBandArrayList.get(0).printMembers();
        MusicBand.transferMembers(musicBandArrayList.get(0), musicBandArrayList.get(1));
        musicBandArrayList.get(0).printMembers();
        musicBandArrayList.get(1).printMembers();


    }
}
