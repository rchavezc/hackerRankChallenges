package com.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player plyr1, Player plyr2) {

        if (plyr1.score == plyr2.score && plyr1.name.compareTo(plyr2.name) == 0)
            return 0;
        else if (plyr1.score > plyr2.score || (plyr1.score == plyr2.score && plyr1.name.compareTo(plyr2.name) <0))
            return -1;
        else
            return 1;
    }
}
