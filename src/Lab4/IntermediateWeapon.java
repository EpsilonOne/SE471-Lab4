package Lab4;

public class IntermediateWeapon implements WeaponIF {

    private String name;
    @Override
    public void setWeapon(String n) {
        this.name = n;

    }

    @Override
    public String getWeapon() {
        return name;
    }
}

