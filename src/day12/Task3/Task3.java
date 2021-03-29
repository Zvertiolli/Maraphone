package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<MusicBand> musicBandArrayList = new ArrayList<>();
        musicBandArrayList.add(new MusicBand("Doors", 1965));
        musicBandArrayList.add(new MusicBand("The Beatles", 1960));
        musicBandArrayList.add(new MusicBand("The Rolling Stones", 1962));
        musicBandArrayList.add(new MusicBand("Queen", 1973));
        musicBandArrayList.add(new MusicBand("Deep Purple", 1968));
        musicBandArrayList.add(new MusicBand("Led Zeppelin", 1968));
        musicBandArrayList.add(new MusicBand("Pink Floyd", 1965));
        musicBandArrayList.add(new MusicBand("AC/DC", 1973));
        musicBandArrayList.add(new MusicBand("Nirvana", 1987));
        musicBandArrayList.add(new MusicBand("Scorpions", 1965));
        musicBandArrayList.add(new MusicBand("Metallica", 1981));
        musicBandArrayList.add(new MusicBand("Guns N’ Roses", 1985));

        System.out.println(musicBandArrayList);

        Collections.shuffle(musicBandArrayList);

        System.out.println(musicBandArrayList);

        System.out.println(groupsAfter1970(musicBandArrayList));
    }
    public static List<MusicBand> groupsAfter1970(List<MusicBand> musicBandList){
        ArrayList<MusicBand> result = new ArrayList<>();
        for (MusicBand musicBand: musicBandList
             ) {
            if (musicBand.getYear()>1970){
                result.add(musicBand);
            }
        }
        return result;
    }
}
