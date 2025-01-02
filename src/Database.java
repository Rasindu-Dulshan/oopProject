import java.util.ArrayList;
import java.util.List;

public class Database {
    //create character objects
    Character shooter = new Character("Shooter", 80, 11, 4, 6, 9);
    Character squire = new Character("Squire", 85, 8, 9, 7, 8);
    Character warlock = new Character("Warlock", 100, 12, 7, 10, 12);
    Character soother = new Character("Soother", 95, 10, 8, 9, 6);
    Character dragon = new Character("Dragon", 120, 12, 14, 15, 8);
    Character ranger = new Character("Ranger", 115, 14, 5, 8, 10);
    Character cavalier = new Character("Cavalier", 110, 10, 12, 7, 10);
    Character illusionist = new Character("Illusionist", 120, 13, 8, 12, 14);
    Character medic = new Character("Medic", 125, 12, 9, 10, 7);
    Character basilisk = new Character("Basilisk", 165, 15, 11, 10, 12);
    Character sunfire = new Character("Sunfire", 160, 15, 5, 7, 14);
    Character templar = new Character("Templar", 155, 15, 16, 12, 12);
    Character enchanter = new Character("Enchanter", 160, 16, 10, 13, 16);
    Character alchemist = new Character("Alchemist", 150, 13, 13, 13, 13);
    Character hydra = new Character("Hydra", 205, 12, 16, 15, 11);
    Character zing = new Character("Zing", 200, 16, 9, 11, 14);
    Character zoro = new Character("Zoro", 180, 17, 16, 13, 14);
    Character conjurer = new Character("Conjurer", 195, 18, 15, 14, 12);
    Character saint = new Character("Saint", 200, 16, 14, 17, 9);
    Character phoenix = new Character("Phoenix", 275, 17, 13, 17, 19);
    Character saggitarius = new Character("Sagittarius", 230, 18, 7, 12, 17);
    Character swiftblade = new Character("Swiftblade", 250, 18, 20, 17, 13);
    Character eldritch = new Character("Eldritch", 270, 19, 17, 18, 14);
    Character lightbringer = new Character("Lightbringer", 260, 17, 15, 19, 12);
    Character pegasus = new Character("Pegasus", 340, 14, 18, 20, 20);

    // Create equipment objects
    Equipment chainmail = new Equipment("Chainmail", 70, 0, 1, 0, -1);
    Equipment regalia = new Equipment("Regalia", 105, 0, 1, 0, 0);
    Equipment fleece = new Equipment("Fleece", 150, 0, 2, 1, -1);
    Equipment excalibur = new Equipment("Excalibur", 150, 2, 0, 0, 0);
    Equipment amulet = new Equipment("Amulet", 200, 1, -1, 1, 1);
    Equipment crystal = new Equipment("Crystal", 210, 2, 1, -1, -1);

    // Create a list of characters
    List<Character> characters = new ArrayList<Character>();

    // Create a list of archers, knights, mages, and healers
    List<Character> archers = new ArrayList<Character>();
    List<Character> knights = new ArrayList<Character>();
    List<Character> mages = new ArrayList<Character>();
    List<Character> heales = new ArrayList<Character>();
    List<Character> mythicalCreatures = new ArrayList<Character>();

    // Create a list of armour and artefacts
    List<Equipment> armour = new ArrayList<Equipment>();
    List<Equipment> artefacts = new ArrayList<Equipment>();
    

    public Database() {
        // Add characters to the list
        characters.add(shooter);
        characters.add(squire);
        characters.add(warlock);
        characters.add(soother);
        characters.add(dragon);
        characters.add(ranger); 
        characters.add(cavalier);
        characters.add(illusionist);
        characters.add(medic);
        characters.add(basilisk);
        characters.add(sunfire);
        characters.add(templar);
        characters.add(enchanter);
        characters.add(alchemist);
        characters.add(hydra);
        characters.add(zing);
        characters.add(zoro);
        characters.add(conjurer);
        characters.add(saint);
        characters.add(phoenix);
        characters.add(saggitarius);
        characters.add(swiftblade);
        characters.add(eldritch);
        characters.add(lightbringer);
        characters.add(pegasus);

        // Add characters to their respective lists
        archers.add(shooter);
        archers.add(ranger);
        archers.add(sunfire);
        archers.add(zing);
        archers.add(saggitarius);

        knights.add(squire);
        knights.add(cavalier);
        knights.add(templar);
        knights.add(zoro);
        knights.add(swiftblade);

        mages.add(warlock);
        mages.add(illusionist);
        mages.add(enchanter);    
        mages.add(conjurer);
        mages.add(eldritch);

        heales.add(soother);
        heales.add(medic);
        heales.add(alchemist);
        heales.add(saint);
        heales.add(lightbringer);

        mythicalCreatures.add(dragon);
        mythicalCreatures.add(basilisk);
        mythicalCreatures.add(hydra);
        mythicalCreatures.add(phoenix);
        mythicalCreatures.add(pegasus);

        // Add armour to the list
        armour.add(chainmail);
        armour.add(regalia);
        armour.add(fleece);

        // Add artefacts to the list
        artefacts.add(excalibur);
        artefacts.add(amulet);
        artefacts.add(crystal);
              
    }

}
