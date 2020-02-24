package Lab4;

public interface ModeFactoryIF {

    public abstract WeaponIF createWeapon(String cName);
    public abstract CharacterIF createCharacter(String wName);
}
