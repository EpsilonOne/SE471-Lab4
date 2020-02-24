package Lab4;

public class IntermediateCharacter implements CharacterIF {

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
