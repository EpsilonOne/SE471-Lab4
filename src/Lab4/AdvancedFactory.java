package Lab4;

public class AdvancedFactory implements ModeFactoryIF {

    /****Methods****/
    //Creates
    public CharacterIF createCharacter(String n) {
        System.out.println(n + " has entered the game.");
        return new AdvancedCharacter();
    }//create character

    public WeaponIF createWeapon(String n) {
        System.out.println("The " + n + " weapon has been equipped.");
        return new AdvancedWeapon();
    }//create weapon

}