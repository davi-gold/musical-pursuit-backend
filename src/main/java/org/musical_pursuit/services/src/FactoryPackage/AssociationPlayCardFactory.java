package org.musical_pursuit.services.src.FactoryPackage;

import java.util.HashMap;
import java.util.List;

import org.musical_pursuit.services.db.JDBC;
import org.musical_pursuit.services.src.PlayCardPackage.IPlayCard;
import org.musical_pursuit.services.src.objects.Song;


public class AssociationPlayCardFactory implements IPlayCardFactory{

    JDBC jdbc;
    int associablesNum = 30;


    public AssociationPlayCardFactory(JDBC jdbc) {
        this.jdbc = jdbc;
    }


    @Override
    public IPlayCard CreatePlayCard() {

//        List<Song> databaseAssociables = jdbc.getBandSongs(associablesNum);

        String[] options = new String[2];
        HashMap<String, Integer> associables = new HashMap<>(associablesNum);

//        options[0] = databaseAssociables.get(0).getArtist().getArtistName();
//        for (int i = 1; i < databaseAssociables.size(); ++i) {
//            String artistName = databaseAssociables.get(i).getArtist().getArtistName();
//            if (!artistName.equals(options[0])) {
//                options[1] = artistName;
//                break;
//            }
//        }

//        for (int i = 0; i < databaseAssociables.size; ++i) {
//          String songName = databaseAssociables.get(i).getTitle();
//          String artistName = databaseAssociables.get(i).getArtist().getArtistName();
//            if (artistName.equals(options[0]) {
//                    associables.put(songName, 0);
//            } else {
//                    associables.put(SongName, 1);
//            }
//        }


//        return new AssociationPlayCard(options, associables);
        return null;
    }
}
