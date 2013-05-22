package developer.encounterTable.dice;

/**
 * This is Custom Encounter table for the three rolls that are not part of the
 * basic interface on the DataDice class. This also extends the DataDice, so I can use this class for
 * the Encounter Table Program.
 *
 * @author richard webb
 */
public class EncounterDice extends DataDice {

    //Custom Rollers for this Encounter Table
    // 2D6 Roller
    public int get2D6() {
        int number = 0;
        for (int count = 1; count <= 2; count++) {
            number = number + super.D6();
        }
        return number;
    }

    //2D4 Roller
    public int get2D4() {
        int number = 0;
        for (int count = 1; count <= 2; count++) {
            number = number + super.D4();
        }
        return number;
    }

    //3D6 roller
    public int get3D6() {
        int number = 0;
        for (int count = 1; count <= 3; count++) {
            number = number + super.D6();
        }
        return number;
    }
}
