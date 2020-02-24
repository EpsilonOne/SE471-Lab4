package Lab4;

public class IntermediateFactory implements ModeFactoryIF
{
    public WeaponPanelIF createWeaponPanel() {
        return new BeginnerWeaponPanel();
    }//create weapon

    public CharacterPanelIF createCharacterPanel() {
        return new BeginnerCharacterPanel();
    }//create character
}