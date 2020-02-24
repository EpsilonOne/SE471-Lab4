package Lab4;

public class AdvancedCharacter implements CharacterIF {

    /****Attributes****/
    private String name;

    /****Methods****/
    //setter
    @Override
    public void setCharacter(String n) {
        this.name = n;

    }

    //getter
    @Override
    public String getCharacter() {
        return name;
    }
}
