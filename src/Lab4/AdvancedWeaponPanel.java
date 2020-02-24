package Lab4;

import java.util.*;

public class AdvancedWeaponPanel implements WeaponPanelIF
{
    private List<String> weapons = new ArrayList<>();

    public AdvancedWeaponPanel()
    {
        addWeaponsToPanel();
    }

    public void addWeaponsToPanel()
    {
        weapons.add("Shane-Saw");
    }

    public List<String> getWeapons()
    {
        return weapons;
    }
}