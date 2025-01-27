import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public abstract class Database {

    public static Map<String, List<Character>> warriors;
    public static Map<String, List<Equipment>> equipment;
    public static List<String> warriorTypes;

    static {
        createDatabase();
    }
    public static void createDatabase() {
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
        Character saggitarius = new Character("Saggitarius", 230, 18, 7, 12, 17);
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

        warriorTypes = Arrays.asList("Archers", "Knights", "Mages", "Healers", "Mythical Creatures");
        warriors = new HashMap<>();
        warriors.put("Archers", Arrays.asList(shooter, ranger, sunfire, zing, saggitarius));
        warriors.put("Knights", Arrays.asList(squire, cavalier, templar, zoro, swiftblade));
        warriors.put("Mages", Arrays.asList(warlock, illusionist, enchanter, conjurer, eldritch));
        warriors.put("Healers", Arrays.asList(soother, medic, alchemist, saint, lightbringer));
        warriors.put("Mythical Creatures", Arrays.asList(dragon, basilisk, hydra, phoenix, pegasus));

        // Create HashMap for equipment
        Map<String, List<Equipment>> equipmentTypes = new HashMap<>();
        equipmentTypes.put("Armor", Arrays.asList(chainmail, regalia, fleece));
        equipmentTypes.put("Artefacts", Arrays.asList(excalibur,amulet, crystal));

    }
    
}
