package Lab4;

public class BeginnerFactory implements ModeFactoryIF {

    public CharacterIF createCharacter(String n) {
        System.out.println(n + " has entered the game.");
        return new BeginnerCharacter();
    }//create character

    public WeaponIF createWeapon(String n) {
        System.out.println("The " + n + " weapon has been equipped.");
        return new BeginnerWeapon();
    }//create weapon


}
