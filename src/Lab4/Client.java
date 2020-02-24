package Lab4;

public class Client
{
    WeaponPanelIF weaponPanel;
    CharacterPanelIF characterPanel;

    public static void main(String[] args)
    {
        FactoryMaker myFactory;
        //myFactory = FactoryMaker.getInstance();
    }

//    public void newGame(String type, String characterName, String weaponName) {
//
//        ModeFactoryIF absFactory;
//        if (type == "beginner")
//            absFactory = myFactory.createFactory(FactoryMaker.Mode.BEGINNER);
//        else if (type == "intermediate")
//            absFactory = myFactory.createFactory(FactoryMaker.Mode.INTERMEDIATE);
//        else
//            absFactory = myFactory.createFactory(FactoryMaker.Mode.ADVANCED);
//
//        CharacterIF character = absFactory.createCharacter(characterName);
//        WeaponIF weapon = absFactory.createWeapon(weaponName);
//
//    }
}
