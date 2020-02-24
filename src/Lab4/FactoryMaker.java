package Lab4;

public class FactoryMaker {

    //The single instance of this class

    private static FactoryMaker myInstance = new FactoryMaker();

    public final static String BEGINNER = "beginner";
    public final static String INTERMEDIATE = "intermediate";
    public final static String ADVANCED = "advanced";

    public static FactoryMaker getInstance(){
        return myInstance;
    }//getInstance()

    //Return new object that implements the ModeFactoryIF for given type.
    public ModeFactoryIF createFactory(String type){
        switch (type) {
            case BEGINNER:
                System.out.println("\nBeginner game Mode Initialized");
                return new BeginnerFactory();

            case INTERMEDIATE:
                System.out.println("\nIntermediate Game Mode Initialized");
                return new IntermediateFactory();

            case ADVANCED:
                System.out.println("\nAdvanced Game Mode Initialized");
                return new AdvancedFactory();

            default:
                String errMsg = type;
                throw new IllegalArgumentException(errMsg);
        }
    }
}
