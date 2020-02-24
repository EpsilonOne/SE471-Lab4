package Lab4;

import java.util.*;

public class BeginnerWeaponPanel implements WeaponPanelIF
{
    private List<String> weapons = new ArrayList<>();

    public BeginnerWeaponPanel()
    {
        addWeaponsToPanel();
    }

    public void addWeaponsToPanel()
    {
        weapons.add("Nerf-Pew-Pew");
    }

    public List<String> getWeapons()
    {
        return weapons;
    }
}