package comp110.lecture19;

import java.util.List;

public class RosterLoader {

    public void load(List<Player> team) {
        team.add(new Player("Meeks", 32, 7));
        team.add(new Player("Hicks", 20, 4));
        team.add(new Player("Pinson", 30, 9));
        team.add(new Player("Jackson", 38, 19));
        team.add(new Player("Berry", 33, 11));
        team.add(new Player("Bradley", 8, 6));
        team.add(new Player("Woods", 1, 0));
        team.add(new Player("White", 5, 2));
        team.add(new Player("Britt", 13, 0));
    }

}