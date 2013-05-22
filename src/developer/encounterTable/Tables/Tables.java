package developer.encounterTable.Tables;

import developer.encounterTable.dice.EncounterDice;

public class Tables {

    // Create instance of a dice roller to roll all dice in the table
    EncounterDice diceRoller = new EncounterDice();

    // Savannah Table
    public String savannahTable() {
        String savannah = "";
        int num = diceRoller.D100();
        if (num <= 6) {
            savannah = "1 cheetah (Avg. CR:2)";
        } else if (num >= 7 && num <= 10) {
            savannah = "1 cockatrice (Avg. CR:3)";
        } else if (num >= 11 && num <= 16) {
            savannah = "1 giant scorpion (Avg. CR:3)";
        } else if (num >= 17 && num <= 20) {
            savannah = "1 dire lion (Avg. CR:5)";
        } else if (num >= 21 && num <= 26) {
            savannah = "1 giant frilled lizard (Avg. CR:5)";
        } else if (num >= 27 && num <= 30) {
            savannah = diceRoller.D6() + " ankhegs (Avg. CR:6)";
        } else if (num >= 31 && num <= 34) {
            savannah = diceRoller.D6() + " pteranodons (Avg. CR:6)";
        } else if (num >= 35 && num <= 40) {
            savannah = diceRoller.D8() + " monitor lizards (Avg. CR:6)";
        } else if (num >= 41 && num <= 44) {
            savannah = diceRoller.D6() + " dire hyenas (Avg. CR:6)";
        } else if (num >= 45 && num <= 52) {
            savannah = diceRoller.get2D6() + " hyenas (Avg. CR:6)";
        } else if (num >= 53 && num <= 60) {
            savannah = diceRoller.get2D6() + " gnolls (Avg. CR:6)";
        } else if (num >= 61 && num <= 66) {
            savannah = diceRoller.D6() + " lions (Avg. CR:6)";
        } else if (num >= 67 && num <= 70) {
            savannah = diceRoller.get2D6() + " giant ants (Avg. CR:7)";
        } else if (num >= 71 && num <= 74) {
            savannah = diceRoller.get2D4() + " pegasi (Avg. CR:7)";
        } else if (num >= 75 && num <= 78) {
            savannah = diceRoller.get2D6() + " centaurs (Avg. CR:8)";
        } else if (num >= 79 && num <= 80) {
            savannah = "1 dire tiger (Avg. CR:8)";
        } else if (num >= 81 && num <= 82) {
            savannah = diceRoller.D6() + " ankylosauruses (Avg. CR:9)";
        } else if (num >= 83 && num <= 84) {
            savannah = diceRoller.D6() + " stegosauruses (Avg. CR:10)";
        } else if (num >= 85 && num <= 88) {
            savannah = diceRoller.get2D4() + " rhinoceroses (Avg. CR:10)";
        } else if (num >= 89 && num <= 90) {
            savannah = "1 gold dragon (young) (Avg. CR:11)";
        } else if (num >= 91 && num <= 94) {
            savannah = diceRoller.get2D4() + " elephants (Avg. CR:11)";
        } else if (num >= 95 && num <= 96) {
            savannah = diceRoller.D6() + " tyrannosauruses (Avg. CR:12)";
        } else if (num >= 97 && num <= 98) {
            savannah = diceRoller.D8() + " triceratops (Avg. CR:12)";
        } else if (num >= 99 && num <= 100) {
            savannah = diceRoller.D6() + " brachiosauruses (Avg. CR:13)";
        }
        return savannah;
    }

    // Ocean Table
    public String oceanTable() {
        String ocean = "";

        //roll the d100
        int num = diceRoller.D100();

        // iterate through the table
        if (num <= 4) {
            ocean = "1 octopus (Avg. CR:1)";
        } else if (num >= 5 && num <= 14) {
            ocean = diceRoller.get2D6() + " dolphins (Avg. CR:4)";
        } else if (num >= 15 && num <= 19) {
            ocean = diceRoller.get2D6() + " merfolk (Avg. CR:4)";
        } else if (num >= 20 && num <= 23) {
            ocean = "1 sea hag (Avg. CR:4)";
        } else if (num >= 24 && num <= 31) {
            ocean = diceRoller.D6() + " squid (Avg. CR:4)";
        } else if (num >= 32 && num <= 36) {
            ocean = diceRoller.D6() + " water mephits (Avg. CR:6)";
        } else if (num >= 37 && num <= 38) {
            ocean = "1 aboleth (Avg. CR:7)";
        } else if (num >= 39 && num <= 42) {
            ocean = "1 giant octopus (Avg. CR:8)";
        } else if (num >= 43 && num <= 50) {
            ocean = diceRoller.get2D6() + " sahuagin (Avg. CR:8)";
        } else if (num >= 51 && num <= 60) {
            ocean = diceRoller.get2D6() + " sharks (Avg. CR:8)";
        } else if (num >= 61 && num <= 66) {
            ocean = diceRoller.get2D6() + " skum (Avg. CR:8)";
        } else if (num >= 67 && num <= 71) {
            ocean = diceRoller.D6() + " giant moray eels (Avg. CR:8)";
        } else if (num >= 72 && num <= 77) {
            ocean = diceRoller.D6() + " Large water elementals (Avg. CR:8)";
        } else if (num >= 78 && num <= 79) {
            ocean = "1 dire shark (Avg. CR:9)";
        } else if (num >= 80 && num <= 81) {
            ocean = "1 dragon turtle (Avg. CR:9)";
        } else if (num >= 82 && num <= 83) {
            ocean = "1 giant squid (Avg. CR:9)";
        } else if (num >= 84 && num <= 85) {
            ocean = diceRoller.D4() + " elasmosauruses (Avg. CR:9)";
        } else if (num >= 86 && num <= 91) {
            ocean = diceRoller.get2D4() + " orcas (Avg. CR:9)";
        } else if (num >= 92 && num <= 93) {
            ocean = "1 bronze dragon (young) (Avg. CR:9)";
        } else if (num >= 94 && num <= 95) {
            ocean = "1 marid (Avg. CR:9)";
        } else if (num >= 96 && num <= 97) {
            ocean = "1 elder water elemental (Avg. CR:11)";
        } else if (num == 98) {
            ocean = "1 sea serpent (Avg. CR:12)";
        } else if (num == 99) {
            ocean = "1 kraken (Avg. CR:18)";
        } else if (num == 100) {
            ocean = "1 shoggoth (Avg. CR:19)";
        }
        return ocean;
    }

    // Mountain/Hill Table
    public String mountainTable() {

        String mountain = "";
        // roll the d100
        int num = diceRoller.D100();

        // iterate through the table
        if (num <= 6) {
            mountain = diceRoller.D6() + " eagles (Avg. CR:2)";
        } else if (num >= 7 && num <= 14) {
            mountain = diceRoller.get2D6() + " orcs (Avg. CR:3)";
        } else if (num >= 15 && num <= 22) {
            mountain = diceRoller.get2D6() + " tengus (Avg. CR:4)";
        } else if (num >= 23 && num <= 30) {
            mountain = diceRoller.get2D6() + " hobgoblins (Avg. CR:4)";
        } else if (num >= 31 && num <= 36) {
            mountain = diceRoller.D4() + " giant eagles (Avg. CR:5)";
        } else if (num >= 37 && num <= 42) {
            mountain = diceRoller.D6() + " ogres (Avg. CR:6)";
        } else if (num >= 43 && num <= 44) {
            mountain = "1 white dragon (young) (Avg. CR:4)";
        } else if (num >= 45 && num <= 48) {
            mountain = "1 bulette (Avg. CR:7)";
        } else if (num >= 49 && num <= 52) {
            mountain = "1 chimera (Avg. CR:7)";
        } else if (num >= 53 && num <= 58) {
            mountain = diceRoller.D6() + " griffons (Avg. CR:7)";
        } else if (num >= 59 && num <= 64) {
            mountain = diceRoller.get2D4() + " bugbears (Avg. CR:7)";
        } else if (num >= 65 && num <= 66) {
            mountain = diceRoller.D6() + " cyclops (Avg. CR:8)";
        } else if (num >= 67 && num <= 68) {
            mountain = "1 gorgon (Avg. CR:8)";
        } else if (num >= 69 && num <= 72) {
            mountain = diceRoller.D4() + " wyverns (Avg. CR:8)";
        } else if (num >= 73 && num <= 78) {
            mountain = diceRoller.D6() + " trolls (Avg. CR:8)";
        } else if (num >= 79 && num <= 80) {
            mountain = "1 ogre mage (Avg. CR:8)";
        } else if (num >= 81 && num <= 82) {
            mountain = "1 roc (Avg. CR:9)";
        } else if (num >= 83 && num <= 86) {
            mountain = diceRoller.D6() + " hill giants (Avg. CR:10)";
        } else if (num >= 87 && num <= 88) {
            mountain = "1 silver dragon (young) (Avg. CR:10)";
        } else if (num >= 89 && num <= 90) {
            mountain = "1 red dragon (young) (Avg. CR:10)";
        } else if (num >= 91 && num <= 92) {
            mountain = diceRoller.D4() + " frost giants (Avg. CR:11)";
        } else if (num >= 93 && num <= 96) {
            mountain = diceRoller.D6() + " stone giants (Avg. CR:11)";
        } else if (num >= 97 && num <= 98) {
            mountain = "1 cloud giant (Avg. CR:11)";
        } else if (num >= 99 && num <= 100) {
            mountain = diceRoller.D4() + " fire giants (Avg. CR:12)";
        }
        return mountain;
    }

    // Jungle(Warm Forest) Table
    public String jungleTable() {
        String jungle = "";

        //roll the d100
        int num = diceRoller.D100();
        // iterate through the table
        if (num <= 4) {
            jungle = "1 bat swarm (Avg. CR:2)";
        } else if (num >= 5 && num <= 8) {
            jungle = "1 yellow musk creeper (Avg. CR:2)";
        } else if (num >= 9 && num <= 14) {
            jungle = "1 constrictor snake (Avg. CR:2)";
        } else if (num >= 15 && num <= 18) {
            jungle = diceRoller.D6() + " giant centipedes (Avg. CR:2)";
        } else if (num >= 19 && num <= 26) {
            jungle = "1 leopard (Avg. CR:2)";
        } else if (num >= 27 && num <= 30) {
            jungle = diceRoller.D4() + " giant spiders (Avg. CR:3)";
        } else if (num >= 31 && num <= 34) {
            jungle = diceRoller.D6() + " venomous snakes (Avg. CR:4)";
        } else if (num >= 35 && num <= 40) {
            jungle = diceRoller.D4() + " boars (Avg. CR:4)";
        } else if (num >= 41 && num <= 44) {
            jungle = "1 dire boar (Avg. CR:4)";
        } else if (num >= 45 && num <= 50) {
            jungle = "1 tiger (Avg. CR:4)";
        } else if (num >= 51 && num <= 54) {
            jungle = "1 giant frilled lizard (Avg. CR:5)";
        } else if (num >= 55 && num <= 60) {
            jungle = diceRoller.D6() + " monitor lizards (Avg. CR:5)";
        } else if (num >= 61 && num <= 62) {
            jungle = "1 army ant swarm (Avg. CR:5)";
        } else if (num >= 63 && num <= 64) {
            jungle = "1 ankylosaurus (Avg. CR:6)";
        } else if (num >= 65 && num <= 70) {
            jungle = diceRoller.D6() + " dire apes (Avg. CR:6)";
        } else if (num >= 71 && num <= 78) {
            jungle = diceRoller.get2D4() + " gorillas (Avg. CR:6)";
        } else if (num >= 79 && num <= 82) {
            jungle = diceRoller.get2D4() + " deinonychuses (Avg. CR:7)";
        } else if (num >= 83 && num <= 84) {
            jungle = "1 nymph (Avg. CR:7)";
        } else if (num >= 85 && num <= 86) {
            jungle = diceRoller.D4() + " girallons (Avg. CR:8)";
        } else if (num >= 87 && num <= 90) {
            jungle = "1 dire tiger (Avg. CR:8)";
        } else if (num >= 91 && num <= 94) {
            jungle = diceRoller.D4() + " shambling mounds (Avg. CR:8)";
        } else if (num >= 95 && num <= 96) {
            jungle = "1 treant (Avg. CR:8)";
        } else if (num >= 97 && num <= 98) {
            jungle = "1 tyrannosaurus (Avg. CR:9)";
        } else if (num >= 99 && num <= 100) {
            jungle = "1 brachiosaurus (Avg. CR:10)";
        }
        return jungle;
    }

    // Forest Table
    public String forestTable() {
        String forest = "";

        //roll d100
        int num = diceRoller.D100();

        //iterate through the table
        if (num <= 6) {
            forest = "1 bat swarm (Avg. CR:2)";
        } else if (num >= 7 && num <= 8) {
            forest = "1 yellow musk creeper (Avg. CR:2)";
        } else if (num >= 9 && num <= 12) {
            forest = diceRoller.D4() + " giant spiders (Avg. CR:3) ";
        } else if (num >= 13 && num <= 16) {
            forest = "1 assassin vine (Avg. CR:3) ";
        } else if (num >= 17 && num <= 20) {
            forest = "1 giant mantis (Avg. CR:3)";
        } else if (num >= 21 && num <= 22) {
            forest = "1 unicorn (Avg. CR:3)";
        } else if (num >= 23 && num <= 26) {
            forest = diceRoller.D4() + " dire bats (Avg. CR:4)";
        } else if (num >= 27 && num <= 32) {
            forest = diceRoller.D4() + " boars (Avg. CR:4)";
        } else if (num >= 33 && num <= 34) {
            forest = "1 dire boar (Avg. CR:4) ";
        } else if (num >= 35 && num <= 38) {
            forest = "1 giant stag beetle (Avg. CR:4)";
        } else if (num >= 39 && num <= 42) {
            forest = "1 owlbear (Avg. CR:4) ";
        } else if (num >= 43 && num <= 46) {
            forest = "1 tiger (Avg. CR:4)";
        } else if (num >= 47 && num <= 52) {
            forest = diceRoller.D6() + " werewolves (Avg. CR:5)";
        } else if (num >= 53 && num <= 56) {
            forest = diceRoller.D4() + " dire wolves (Avg. CR:5)";
        } else if (num >= 57 && num <= 60) {
            forest = "1 ettercap and " + diceRoller.D6() + " giant spiders (Avg. CR:5)";
        } else if (num >= 61 && num <= 70) {
            forest = diceRoller.get2D6() + " goblins and " + diceRoller.D4() + " goblin dogs (Avg. CR:5)";
        } else if (num >= 71 && num <= 74) {
            forest = "1 barghest and " + diceRoller.D4() + " goblin dogs (Avg. CR:6)";
        } else if (num >= 75 && num <= 78) {
            forest = diceRoller.D6() + " centaurs (Avg. CR:6)";
        } else if (num >= 79 && num <= 86) {
            forest = diceRoller.get2D6() + " wolves (Avg. CR:6)";
        } else if (num >= 87 && num <= 88) {
            forest = "1 nymph (Avg. CR:7)";
        } else if (num >= 89 && num <= 92) {
            forest = "1 dire tiger (Avg. CR:8)";
        } else if (num >= 93 && num <= 94) {
            forest = "1 green dragon (young) (Avg. CR:8)";
        } else if (num >= 95 && num <= 98) {
            forest = diceRoller.D4() + " shambling mounds (Avg. CR:8)";
        } else if (num >= 99 && num <= 100) {
            forest = "1 treant (Avg. CR:8)";
        }
        return forest;
    }

    // The Dungeon(Low-Level) Table
    public String dungeonLowTable() {
        String dungeonLow = "";
        // roll d100
        int num = diceRoller.D100();

        // iterate through the table
        if (num <= 6) {
            dungeonLow = diceRoller.D6() + " dire rats (Avg. CR: 1)";
        } else if (num >= 7 && num <= 12) {
            dungeonLow = diceRoller.D6() + " fire beetles (Avg. CR:1)";
        } else if (num >= 13 && num <= 20) {
            dungeonLow = diceRoller.D6() + " human skeletons (Avg. CR:1)";
        } else if (num >= 21 && num <= 24) {
            dungeonLow = diceRoller.D4() + " giant centipedes (Avg. CR:1)";
        } else if (num >= 25 && num <= 26) {
            dungeonLow = "1 spider swarm (Avg. CR:1)";
        } else if (num >= 25 && num <= 26) {
            dungeonLow = "1 spider swarm (Avg. CR:1)";
        } else if (num >= 27 && num <= 32) {
            dungeonLow = diceRoller.D6() + " human zombies (Avg. CR:2)";
        } else if (num >= 33 && num <= 34) {
            dungeonLow = "1 choker (Avg. CR:2)";
        } else if (num >= 35 && num <= 36) {
            dungeonLow = "1 skeletal champion (Avg. CR:2)";
        } else if (num >= 37 && num <= 44) {
            dungeonLow = diceRoller.get2D6() + " goblins (Avg. CR:3)";
        } else if (num >= 45 && num <= 48) {
            dungeonLow = diceRoller.D4() + " ghouls (Avg. CR:3)";
        } else if (num >= 49 && num <= 54) {
            dungeonLow = diceRoller.D4() + " giant spiders (Avg. CR:3)";
        } else if (num >= 55 && num <= 56) {
            dungeonLow = "1 cockatrice (Avg. CR:3)";
        } else if (num >= 57 && num <= 60) {
            dungeonLow = "1 gelatinous cube (Avg. CR:3)";
        } else if (num >= 61 && num <= 64) {
            dungeonLow = "1 rust monster (Avg. CR:3)";
        } else if (num >= 65 && num <= 68) {
            dungeonLow = "1 shadow (Avg. CR:3)";
        } else if (num >= 69 && num <= 70) {
            dungeonLow = "1 wight (Avg. CR:3)";
        } else if (num >= 71 && num <= 76) {
            dungeonLow = diceRoller.get2D4() + " stirges (Avg. CR:4)";
        } else if (num >= 77 && num <= 82) {
            dungeonLow = diceRoller.D6() + " dark mantles (Avg. CR:4)";
        } else if (num >= 83 && num <= 86) {
            dungeonLow = diceRoller.D6() + " troglodytes (Avg. CR:4)";
        } else if (num >= 87 && num <= 90) {
            dungeonLow = diceRoller.D4() + " bugbears (Avg. CR:4)";
        } else if (num >= 91 && num <= 92) {
            dungeonLow = diceRoller.D4() + " vargouilles (Avg. CR:4)";
        } else if (num >= 93 && num <= 94) {
            dungeonLow = "1 gray ooze (Avg. CR:4)";
        } else if (num >= 95 && num <= 96) {
            dungeonLow = "1 mimic (Avg. CR:4)";
        } else if (num >= 97 && num <= 100) {
            dungeonLow = "1 ogre (Avg. CR:4)";
        }
        return dungeonLow;
    }

    // The Dungeon(Mid-Level) Table
    public String dungeonMidTable() {
        String dungeonMid = "";

        //roll d100
        int num = diceRoller.D100();

        //iterate through the table
        if (num <= 4) {
            dungeonMid = "1 gelatinous cube (Avg. CR: 3)";
        } else if (num >= 5 && num <= 8) {
            dungeonMid = "1 rust monster (Avg. CR:3)";
        } else if (num >= 9 && num <= 16) {
            dungeonMid = diceRoller.get2D4() + " stirges (Avg. CR:4)";
        } else if (num >= 17 && num <= 22) {
            dungeonMid = "1 gray ooze (Avg. CR:4)";
        } else if (num >= 23 && num <= 26) {
            dungeonMid = "1 mimic (Avg. CR:4)";
        } else if (num >= 27 && num <= 30) {
            dungeonMid = "1 basilisk (Avg. CR:5)";
        } else if (num >= 31 && num <= 34) {
            dungeonMid = "1 cloaker (Avg. CR:5)";
        } else if (num >= 35 && num <= 38) {
            dungeonMid = "1 gibbering mouther (Avg. CR:5)";
        } else if (num >= 39 && num <= 42) {
            dungeonMid = "1 ochre jelly (Avg. CR:5)";
        } else if (num >= 43 && num <= 46) {
            dungeonMid = "1 wraith (Avg. CR:5)";
        } else if (num >= 47 && num <= 48) {
            dungeonMid = "1 bearded devil (Avg. CR:5)";
        } else if (num >= 49 && num <= 52) {
            dungeonMid = diceRoller.D4() + " shadows (Avg. CR:5)";
        } else if (num >= 53 && num <= 56) {
            dungeonMid = diceRoller.D4() + " wights (Avg. CR:5)";
        } else if (num >= 57 && num <= 62) {
            dungeonMid = diceRoller.D8() + " skeletal champions (Avg. CR:6)";
        } else if (num >= 63 && num <= 68) {
            dungeonMid = diceRoller.get2D4() + " ghouls plus 1 ghast (Avg. CR:6)";
        } else if (num >= 69 && num <= 72) {
            dungeonMid = "1 ettin (Avg. CR:6)";
        } else if (num >= 73 && num <= 78) {
            dungeonMid = "1 minotaur (Avg. CR:4)";
        } else if (num >= 79 && num <= 84) {
            dungeonMid = diceRoller.D4() + " ogres (Avg. CR:6)";
        } else if (num >= 85 && num <= 88) {
            dungeonMid = diceRoller.D4() + " trolls (Avg. CR:7)";
        } else if (num >= 89 && num <= 90) {
            dungeonMid = "1 babau (Avg. CR:7)";
        } else if (num >= 91 && num <= 94) {
            dungeonMid = "1 black pudding (Avg. CR:7)";
        } else if (num >= 95 && num <= 96) {
            dungeonMid = "1 medusa (Avg. CR:7)";
        } else if (num >= 97 && num <= 98) {
            dungeonMid = "1 shadow demon (Avg. CR:7)";
        } else if (num >= 99 && num <= 100) {
            dungeonMid = diceRoller.D4() + " xills (Avg. CR:8)";
        }
        return dungeonMid;
    }

    //  The Dungeon(High-Level) Table
    public String dungeonHighTable() {
        String dungeonHigh = "";
        //roll d100
        int num = diceRoller.D100();

        //iterate through the table
        if (num <= 4) {
            dungeonHigh = "1 black pudding (Avg. CR: 7)";
        } else if (num >= 5 && num <= 8) {
            dungeonHigh = "1 dark naga (Avg. CR:8)";
        } else if (num >= 9 && num <= 14) {
            dungeonHigh = "1 mohrg (Avg. CR:8)";
        } else if (num >= 15 && num <= 18) {
            dungeonHigh = "1 nabasu (Avg. CR:8)";
        } else if (num >= 19 && num <= 22) {
            dungeonHigh = diceRoller.D6() + " cloakers (Avg. CR:8)";
        } else if (num >= 23 && num <= 28) {
            dungeonHigh = diceRoller.D6() + " wraiths (Avg. CR:8)";
        } else if (num >= 29 && num <= 36) {
            dungeonHigh = diceRoller.D4() + " ettins (Avg. CR:8)";
        } else if (num >= 37 && num <= 40) {
            dungeonHigh = "1 bone devil (Avg. CR:9)";
        } else if (num >= 41 && num <= 44) {
            dungeonHigh = "1 night hag (Avg. CR:9)";
        } else if (num >= 45 && num <= 48) {
            dungeonHigh = "1 spirit naga (Avg. CR:9)";
        } else if (num >= 49 && num <= 54) {
            dungeonHigh = "1 vampire (Avg. CR:9)";
        } else if (num >= 55 && num <= 58) {
            dungeonHigh = "1 vrock (Avg. CR:9)";
        } else if (num >= 59 && num <= 66) {
            dungeonHigh = diceRoller.D6() + " minotaurs (Avg. CR:9)";
        } else if (num >= 67 && num <= 72) {
            dungeonHigh = diceRoller.get2D4() + " trolls (Avg. CR:9)";
        } else if (num >= 73 && num <= 76) {
            dungeonHigh = diceRoller.D4() + " great shadows (Avg. CR:10)";
        } else if (num >= 77 && num <= 78) {
            dungeonHigh = "1 bebilith (Avg. CR:10)";
        } else if (num >= 79 && num <= 82) {
            dungeonHigh = "1 barbed devil (Avg. CR:11)";
        } else if (num >= 83 && num <= 86) {
            dungeonHigh = "1 devourer (Avg. CR:11)";
        } else if (num >= 87 && num <= 88) {
            dungeonHigh = "1 hezrou (Avg. CR:11)";
        } else if (num >= 89 && num <= 92) {
            dungeonHigh = diceRoller.D4() + " rakshasas (Avg. CR:12)";
        } else if (num >= 93 && num <= 94) {
            dungeonHigh = "1 lich (Avg. CR:12)";
        } else if (num >= 95 && num <= 96) {
            dungeonHigh = "1 glabrezu (Avg. CR:13)";
        } else if (num >= 97 && num <= 98) {
            dungeonHigh = "1 ice devil (Avg. CR:13)";
        } else if (num >= 99 && num <= 100) {
            dungeonHigh = "1 nalfeshnee (Avg. CR:14)";
        }

        return dungeonHigh;
    }

    // Desert Table
    public String desertTable() {
        String desert = "";
        // roll d100
        int num = diceRoller.D100();
        // go through the table
        if (num <= 8) {
            desert = "1 giant spider (Avg. CR: 1)";
        } else if (num >= 9 && num <= 12) {
            desert = "1 skeletal champion (Avg. CR: 2)";
        } else if (num >= 13 && num <= 18) {
            desert = diceRoller.D8() + " skeletons (Avg. CR: 2)";
        } else if (num >= 19 && num <= 22) {
            desert = "1 bat swarm (Avg. CR: 2)";
        } else if (num >= 23 && num <= 30) {
            desert = "1 giant scorpion (Avg. CR: 3)";
        } else if (num >= 31 && num <= 34) {
            desert = diceRoller.D3() + " dire bats (Avg. CR: 4)";
        } else if (num >= 35 && num <= 42) {
            desert = diceRoller.D6() + " venomous snakes (Avg. CR: 4)";
        } else if (num >= 43 && num <= 46) {
            desert = "1 basilisk (Avg. CR: 5)";
        } else if (num >= 47 && num <= 52) {
            desert = "1 mummy (Avg. CR: 5)";
        } else if (num >= 53 && num <= 56) {
            desert = diceRoller.D4() + " jann (Avg. CR: 6)";
        } else if (num >= 57 && num <= 60) {
            desert = "1 lamia (Avg. CR: 6)";
        } else if (num >= 61 && num <= 68) {
            desert = diceRoller.get2D6() + " giant ants (Avg. CR: 6)";
        } else if (num >= 69 && num <= 72) {
            desert = "1 brass dragon (young) (Avg. CR: 7)";
        } else if (num >= 73 && num <= 80) {
            desert = diceRoller.get2D6() + " gnolls and " + diceRoller.D4() + " hyenas (Avg. CR: 7)";
        } else if (num >= 81 && num <= 84) {
            desert = "1 remorhaz (cold desert only) (Avg. CR: 7)";
        } else if (num >= 85 && num <= 88) {
            desert = "1 behir (Avg. CR: 8)";
        } else if (num >= 89 && num <= 92) {
            desert = "1 sphinx (Avg. CR: 8)";
        } else if (num >= 93 && num <= 96) {
            desert = "1 blue dragon (young) (Avg. CR: 9)";
        } else if (num >= 97 && num <= 98) {
            desert = "1 brass dragon (adult) (Avg. CR: 11)";
        } else if (num >= 99) {
            desert = "1 blue dragon (adult) (Avg. CR: 13)";
        }

        return desert;
    }

    // Ruined City Table
    public String ruinedCityTable() {
        String ruined = "";

        //roll the d100
        int num = diceRoller.D100();
        // iterate through the table
        if (num <= 4) {
            ruined = "1 spider swarm (Avg. CR:1)";
        } else if (num >= 5 && num <= 8) {
            ruined = "1 rat swarm (Avg. CR:1)";
        } else if (num >= 9 && num <= 16) {
            ruined = diceRoller.get2D6() + " human skeletons (Avg. CR:3)";
        } else if (num >= 17 && num <= 24) {
            ruined = diceRoller.D6() + " stirges (Avg. CR:3)";
        } else if (num >= 25 && num <= 28) {
            ruined = "1 assasin vine (Avg. CR:3)";
        } else if (num >= 29 && num <= 36) {
            ruined = diceRoller.D6() + " ghouls (Avg. CR:4)";
        } else if (num >= 37 && num <= 38) {
            ruined = "1 barghest (Avg. CR:4)";
        } else if (num >= 39 && num <= 44) {
            ruined = diceRoller.D6() + " skeletal champions (Avg. CR:5)";
        } else if (num >= 45 && num <= 48) {
            ruined = diceRoller.D4() + " yeth hounds (Avg. CR:5)";
        } else if (num >= 49 && num <= 54) {
            ruined = diceRoller.D6() + " ogres (Avg. CR:6)";
        } else if (num >= 55 && num <= 58) {
            ruined = diceRoller.D6() + " shadows (Avg. CR:6)";
        } else if (num >= 59 && num <= 62) {
            ruined = diceRoller.D6() + " wights (Avg. CR:6)";
        } else if (num >= 63 && num <= 64) {
            ruined = "1 lamia (Avg. CR:6)";
        } else if (num >= 65 && num <= 70) {
            ruined = diceRoller.D6() + " harpies (Avg. CR:7)";
        } else if (num >= 71 && num <= 72) {
            ruined = "1 medusa (Avg. CR:7)";
        } else if (num >= 73 && num <= 74) {
            ruined = "1 nabasu (Avg. CR:8)";
        } else if (num >= 75 && num <= 76) {
            ruined = "1 dark naga (Avg. CR:8)";
        } else if (num >= 77 && num <= 84) {
            ruined = diceRoller.D8() + " gargoyles (Avg. CR:8)";
        } else if (num >= 85 && num <= 88) {
            ruined = diceRoller.D6() + " cyclopes (Avg. CR:8)";
        } else if (num >= 89 && num <= 92) {
            ruined = diceRoller.D6() + " wraiths (Avg. CR:8)";
        } else if (num >= 93 && num <= 94) {
            ruined = "1 behir (Avg. CR:8)";
        } else if (num >= 95 && num <= 96) {
            ruined = "1 sphinx (Avg. CR:8)";
        } else if (num >= 97 && num <= 98) {
            ruined = "1 spirit naga (Avg. CR:9)";
        } else if (num >= 99 && num <= 100) {
            ruined = diceRoller.D4() + " spectres (Avg. CR:9)";
        }
        return ruined;
    }

    // Urban City Table
    public String urbanTable() {
        String urban = "";

        //roll the d100
        int num = diceRoller.D100();
        //iterate through the table
        if (num <= 12) {
            urban = diceRoller.D6() + " dogs (Avg. CR:1)";
        } else if (num >= 13 && num <= 20) {
            urban = "1 rat swarm (Avg. CR:2)";
        } else if (num >= 21 && num <= 30) {
            urban = diceRoller.D6() + " riding dogs (Avg. CR:2)";
        } else if (num >= 31 && num <= 32) {
            urban = "1 werewolf (Avg. CR:2)";
        } else if (num >= 33 && num <= 40) {
            urban = diceRoller.get3D6() + " dire rats (Avg. CR:4)";
        } else if (num >= 41 && num <= 48) {
            urban = diceRoller.get2D6() + " tengus (Avg. CR:4)";
        } else if (num >= 49 && num <= 56) {
            urban = diceRoller.get2D6() + " tieflings (Avg. CR:4)";
        } else if (num >= 57 && num <= 62) {
            urban = diceRoller.D6() + " ghouls (Avg. CR:4)";
        } else if (num >= 63 && num <= 68) {
            urban = diceRoller.D6() + " doppelgangers (Avg. CR:5)";
        } else if (num >= 69 && num <= 78) {
            urban = diceRoller.get2D6() + " wererats (Avg. CR:7)";
        } else if (num >= 79 && num <= 82) {
            urban = "1 succubus (Avg. CR:7)";
        } else if (num >= 83 && num <= 86) {
            urban = diceRoller.D6() + " jann (Avg. CR:7)";
        } else if (num >= 87 && num <= 90) {
            urban = diceRoller.D8() + " gargoyles (Avg. CR:8)";
        } else if (num >= 91 && num <= 92) {
            urban = "1 mohrg (Avg. CR:8)";
        } else if (num >= 93 && num <= 94) {
            urban = "1 intellect devourer (body theft) (Avg. CR:8)";
        } else if (num >= 95 && num <= 96) {
            urban = "1 vampire (Avg. CR:9)";
        } else if (num >= 97 && num <= 98) {
            urban = "1 night hag (Avg. CR:9)";
        } else if (num >= 99 && num <= 100) {
            urban = "1 rakshasa (Avg. CR:10)";
        }
        return urban;
    }

    // Swamp Table
    public String swampTable() {
        String swamp = "";

        // roll the d100
        int num = diceRoller.D100();
        // iterate through the table
        if (num <= 6) {
            swamp = "1 constrictor snake (Avg. CR:2)";
        } else if (num >= 7 && num <= 10) {
            swamp = "1 hydra (Avg. CR:4)";
        } else if (num >= 11 && num <= 14) {
            swamp = "1 leech swarm (Avg. CR:4)";
        } else if (num >= 15 && num <= 18) {
            swamp = "1 gray ooze (Avg. CR:4)";
        } else if (num >= 19 && num <= 22) {
            swamp = "1 green hag (Avg. CR:5)";
        } else if (num >= 23 && num <= 26) {
            swamp = "1 ochre jelly (Avg. CR:5)";
        } else if (num >= 27 && num <= 32) {
            swamp = diceRoller.get2D6() + " stirges (Avg. CR:5)";
        } else if (num >= 33 && num <= 38) {
            swamp = diceRoller.D6() + " crocodiles (Avg. CR:5)";
        } else if (num >= 39 && num <= 46) {
            swamp = diceRoller.get2D6() + " giant frogs (Avg. CR:6)";
        } else if (num >= 47 && num <= 52) {
            swamp = diceRoller.get2D6() + " goblin dogs (Avg. CR:6)";
        } else if (num >= 53 && num <= 56) {
            swamp = diceRoller.D4() + " harpies (Avg. CR:6)";
        } else if (num >= 57 && num <= 64) {
            swamp = diceRoller.get2D6() + " lizardfolk (Avg. CR:6)";
        } else if (num >= 65 && num <= 72) {
            swamp = diceRoller.get2D6() + " boggards (Avg. CR:7)";
        } else if (num >= 73 && num <= 74) {
            swamp = "1 chuul (Avg. CR:7)";
        } else if (num >= 75 && num <= 76) {
            swamp = "1 dracolisk (Avg. CR:7)";
        } else if (num >= 77 && num <= 80) {
            swamp = diceRoller.get2D6() + " giant leeches (Avg. CR:7)";
        } else if (num >= 81 && num <= 82) {
            swamp = "1 black dragon (young) (Avg. CR:7)";
        } else if (num >= 83 && num <= 84) {
            swamp = "1 giant slug (Avg. CR:8)";
        } else if (num >= 85 && num <= 88) {
            swamp = diceRoller.D6() + " shambling mounds (Avg. CR:9)";
        } else if (num >= 89 && num <= 90) {
            swamp = "1 spirit naga (Avg. CR:9)";
        } else if (num >= 91 && num <= 94) {
            swamp = diceRoller.D6() + " will-o'-wisps (Avg. CR:9)";
        } else if (num >= 95 && num <= 96) {
            swamp = "1 dire crocodile (Avg. CR:9)";
        } else if (num >= 97 && num <= 98) {
            swamp = "1 giant flytrap (Avg. CR:10)";
        } else if (num >= 99 && num <= 100) {
            swamp = "1 froghemoth (Avg. CR:13)";
        }
        return swamp;
    }

    //Underground Table
    public String undergroundTable() {
        String underground = "";

        // roll the d100
        int num = diceRoller.D100();
        // iterate through the table
        if (num <= 10) {
            underground = diceRoller.get2D6() + " duergar (Avg. CR:4)";
        } else if (num >= 11 && num <= 16) {
            underground = diceRoller.D6() + " cave fishers (Avg. CR:5)";
        } else if (num >= 17 && num <= 22) {
            underground = "1 basidirond (Avg. CR:5)";
        } else if (num >= 23 && num <= 32) {
            underground = diceRoller.get2D6() + " drow and 1 drow noble (Avg. CR:5)";
        } else if (num >= 33 && num <= 40) {
            underground = diceRoller.get2D6() + " giant spiders (Avg. CR:6)";
        } else if (num >= 41 && num <= 46) {
            underground = diceRoller.D6() + " violet fungi (Avg. CR:6)";
        } else if (num >= 47 && num <= 52) {
            underground = diceRoller.D8() + " derros (Avg. CR:7)";
        } else if (num >= 53 && num <= 60) {
            underground = diceRoller.get2D6() + " morlocks (Avg. CR:7)";
        } else if (num >= 61 && num <= 64) {
            underground = "1 black pudding (Avg. CR:7)";
        } else if (num >= 65 && num <= 68) {
            underground = "1 giant slug (Avg. CR:8)";
        } else if (num >= 69 && num <= 72) {
            underground = diceRoller.D6() + " cloakers (Avg. CR:8)";
        } else if (num >= 73 && num <= 82) {
            underground = diceRoller.get2D6() + " dark creepers and 1 dark stalker (Avg. CR:8)";
        } else if (num >= 83 && num <= 86) {
            underground = diceRoller.D6() + " driders (Avg. CR:10)";
        } else if (num >= 87 && num <= 90) {
            underground = diceRoller.D6() + " intellect devourers (Avg. CR:11)";
        } else if (num >= 91 && num <= 92) {
            underground = "1 purple worm (Avg. CR:12)";
        } else if (num >= 93 && num <= 96) {
            underground = diceRoller.D4() + " ropers (Avg. CR:14)";
        } else if (num >= 97 && num <= 98) {
            underground = "1 neothelid (Avg. CR:15)";
        } else if (num >= 99 && num <= 100) {
            underground = "1 shoggoth (Avg. CR:19)";
        }
        return underground;
    }
}
