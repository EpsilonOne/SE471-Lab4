package Lab4;

public class IntermediateCharacterPanel implements CharacterPanelIF {

    /****Attributes****/
    private String name;
    @Override
    public void setCharacter(String n) {
        this.name = n;
        System.out.println(name + " has entered the game.");

    }

    @Override
    public String getCharacter() {
        return name;
    }
}
