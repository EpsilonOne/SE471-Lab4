package Lab4;

public class Client {
    public void newGame(String type, String characterName, String weaponName) {
        FactoryMaker myFactory;
        myFactory = FactoryMaker.getInstance();
        ModeFactoryIF absFactory;
        if (type == "beginner")
            absFactory = myFactory.createFactory(FactoryMaker.BEGINNER);
        else if (type == "intermediate")
            absFactory = myFactory.createFactory(FactoryMaker.INTERMEDIATE);
        else
            absFactory = myFactory.createFactory(FactoryMaker.ADVANCED);

        CharacterIF character = absFactory.createCharacter(characterName);
        WeaponIF weapon = absFactory.createWeapon(weaponName);




    }


    public static void main(String[] args) {

        Client beginnerGame = new Client();
        Client intermediateGame = new Client();
        Client advancedGame = new Client();

        beginnerGame.newGame("beginner", "Justin", "Pea-Shooter");
        intermediateGame.newGame("intermediate", "Anthony", "Destroyer");
        advancedGame.newGame("advanced", "Shane", "Shane-Saw");







    }
}
