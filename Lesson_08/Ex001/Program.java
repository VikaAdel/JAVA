package Lesson_08.Ex001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {


        // Герой - герой ли?
        // #region teams

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();// список героев
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());// кресты
                    break;
                case 1:
                    teams.add(new Magician());//маги
                    break;
                case 2:
                    teams.add(new Druid());// друиды
                    break;
                default:
                    teams.add(new BaseHero()); //герои
                    break;
            }
            System.out.println(teams.get(i).getInfo());

        }

        System.out.println();

        // #endregion
        // #region

        BaseHero hero = new BaseHero(); System.out.println(hero);
        Magician magician = new Magician(); System.out.println(magician);
        Priest priest = new Priest(); System.out.println(priest);
        Druid druid = new Druid(); System.out.println(druid);

        

        // #endregion

    }
}