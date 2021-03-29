package day12.Task4;



import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<MusicBand> musicBandArrayList = new ArrayList<>();
        musicBandArrayList.add(new MusicBand("Doors", 1965));
        musicBandArrayList.add(new MusicBand("The Beatles", 1960));
        musicBandArrayList.add(new MusicBand("The Rolling Stones", 1962));
        musicBandArrayList.add(new MusicBand("Queen", 1973));
        musicBandArrayList.add(new MusicBand("Deep Purple", 1968));

        musicBandArrayList.get(1).setMembers(new ArrayList<>(Arrays.asList("Jon Lennon", "Ringo Star")));

        musicBandArrayList.get(1).printMembers();

        MusicBand.transferMembers(musicBandArrayList.get(1),musicBandArrayList.get(3));

        musicBandArrayList.get(3).printMembers();
        musicBandArrayList.get(1).printMembers();


    }
}
