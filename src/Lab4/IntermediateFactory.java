package Lab4;

public class IntermediateFactory implements ModeFactoryIF {
    public CharacterIF createCharacter(String n) {
        System.out.println(n + " has entered the game.");
        return new IntermediateCharacter();
    }//create character

    public WeaponIF createWeapon(String n) {
        System.out.println("The " + n + " weapon has been equipped.");
        return new IntermediateWeapon();
    }//create weapon
}