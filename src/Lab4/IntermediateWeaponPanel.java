package Lab4;

import java.util.*;

public class IntermediateWeaponPanel implements WeaponPanelIF
{
    private List<String> weapons = new ArrayList<>();

    public IntermediateWeaponPanel()
    {
        addWeaponsToPanel();
    }

    public void addWeaponsToPanel()
    {
        weapons.add("Giga-Blaster");
    }

    public List<String> getWeapons()
    {
        return weapons;
    }
}